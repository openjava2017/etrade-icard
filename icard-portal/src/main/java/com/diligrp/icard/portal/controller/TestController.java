package com.diligrp.icard.portal.controller;

import com.diligrp.icard.portal.httl.HttlLayoutViewSupport;
import com.diligrp.icard.shared.domain.Message;
import com.diligrp.icard.shared.domain.builder.MessageBuilder;
import com.diligrp.icard.shared.sequence.IKeyGenerator;
import com.diligrp.icard.shared.sequence.KeyGeneratorManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 测试控制器
 *
 * @author: brenthuang
 * @date: 2018/01/04
 */
@Controller
public class TestController extends HttlLayoutViewSupport {

    @Resource
    private KeyGeneratorManager keyGeneratorManager;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        return toDefault("application/index");
    }

    @RequestMapping(value = "/test.action")
    public @ResponseBody Message test() {
        IKeyGenerator keyGenerator = keyGeneratorManager.getKeyGenerator(KeyGeneratorManager.SequenceKey.FUND_TRANSACTION);
        return new MessageBuilder().success(String.valueOf(keyGenerator.nextId())).build();
    }
}
