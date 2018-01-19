package com.diligrp.icard.proxy.controller;

import com.diligrp.icard.proxy.component.ICallableServiceEngine;
import com.diligrp.icard.proxy.domain.*;
import com.diligrp.icard.proxy.exception.PackDataEnvelopException;
import com.diligrp.icard.proxy.exception.ServiceAccessException;
import com.diligrp.icard.proxy.exception.UnpackDataEnvelopException;
import com.diligrp.icard.shared.Constants;
import com.diligrp.icard.shared.json.JsonUtils;
import com.diligrp.icard.shared.security.HexUtils;
import com.diligrp.icard.shared.security.KeyStoreUtils;
import com.diligrp.icard.shared.security.RsaCipher;
import com.diligrp.icard.shared.type.ErrorCode;
import com.diligrp.icard.shared.util.AssertUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * 对外提供Http接口的基础服务类
 * 对接口传入的数据进行拆包、内部服务调用和对返回的业务数据进行封包等操作
 * 如果不需要进行接口数据安全验证：数据签名和验签，则无需继承此类
 *
 * @author: brenthuang
 * @date: 2018/01/08
 */
public abstract class AbstractServiceEndpoint {

    private static Logger LOG = LoggerFactory.getLogger(AbstractServiceEndpoint.class);

    private volatile PrivateKey privateKey;

    private Object lock = new Object();

    @Resource
    private ICallableServiceEngine callableServiceEngine;

    /**
     * 获取系统证书库地址
     *
     * @return 证书库地址classpath
     */
    public abstract String getKeyStorePath();

    /**
     * 证书中私钥的别名
     *
     * @return 私钥别名
     */
    public abstract String getKeyAlias();

    /**
     * 证书库存储格式
     *
     * @return 证书库格式，比如JKS或p12等
     */
    public abstract String getStoreType();

    /**
     * 证书库访问密码
     *
     * @return 证书库访问密码
     */
    public abstract String getStorePass();

    /**
     * 私钥密码
     *
     * @return 私钥密码
     */
    public abstract String getKeyPass();

    protected RequestContext checkAccessPermission(MessageEnvelop envelop) {
        AssertUtils.notNull(envelop.getAppId(), "Argument missed: App Id");

        RequestContext context = new RequestContext();
        return context;
    }

    protected final void unpackEnvelop(MessageEnvelop envelop, String secretKey) throws UnpackDataEnvelopException {
        try {
            byte[] data = HexUtils.decodeHex(envelop.getBody());
            byte[] sign = HexUtils.decodeHex(envelop.getSignature());

            PublicKey publicKey = RsaCipher.getPublicKey(secretKey);
            boolean result = RsaCipher.verify(data, sign, publicKey);
            if (!result) {
                throw new UnpackDataEnvelopException(ErrorCode.DATA_VERIFY_FAILED);
            }

            if (envelop.getCharset() == null) {
                envelop.setCharset(Constants.DEFAULT_CHARSET);
            }
            String content = new String(data, envelop.getCharset());
            envelop.setBody(content);
            LOG.debug("unpackEnvelop: " + content);
        } catch (UnpackDataEnvelopException dex) {
            throw dex;
        } catch (Exception ex) {
            throw new UnpackDataEnvelopException(ErrorCode.UNKNOWN_EXCEPTION, ex);
        }
    }

    protected final ServiceResponse<?> sendEnvelop(RequestContext context, MessageEnvelop envelop) throws Throwable {
        CallableServiceEndpoint<?> endpoint = callableServiceEngine.getCallableServiceEndpoint(envelop.getService());
        if (endpoint == null) {
            throw new ServiceAccessException(ErrorCode.SERVICE_UNAVAILABLE);
        }

        ServiceRequest request = new ServiceRequest();
        request.setContext(context);
        request.setData(JsonUtils.fromJsonString(envelop.getBody(), endpoint.getRequiredType()));

        Object result = endpoint.call(request);
        if (result instanceof ServiceResponse) {
            return (ServiceResponse) result;
        } else {
            return ServiceResponse.success(result);
        }
    }

    protected final MessageEnvelop packEnvelop(MessageEnvelop template, String content) throws PackDataEnvelopException {
        try {
            LOG.debug("packEnvelop: " + content);
            if (template.getCharset() == null) {
                template.setCharset(Constants.DEFAULT_CHARSET);
            }

            byte[] data = content.getBytes(template.getCharset());
            template.setBody(HexUtils.encodeHexStr(data));
            try {
                byte[] sign = RsaCipher.sign(data, loadPrivateKey());
                template.setSignature(HexUtils.encodeHexStr(sign));
            } catch (Exception ex) {
                throw new PackDataEnvelopException(ErrorCode.DATA_SIGN_FAILED, ex);
            }
            return template;
        } catch (PackDataEnvelopException dex) {
            throw dex;
        } catch (Exception ex) {
            throw new PackDataEnvelopException(ErrorCode.UNKNOWN_EXCEPTION, ex);
        }
    }

    private PrivateKey loadPrivateKey() throws Exception {
        if (privateKey == null) {
            synchronized (lock) {
                if (privateKey == null) {
                    privateKey = KeyStoreUtils.getPrivateKey(getKeyStorePath(), getStoreType(), getStorePass(),
                            getKeyAlias(), getKeyPass());
                    LOG.debug("PrivateKey loaded from " + getKeyStorePath());
                }
            }
        }
        return privateKey;
    }
}
