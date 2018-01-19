package com.diligrp.icard.proxy.exception;

import com.diligrp.icard.shared.type.ErrorCode;

/**
 * 服务访问异常
 *
 * @author: brenthuang
 * @date: 2018/01/08
 */
public class ServiceAccessException extends RuntimeException {
    private int code;

    private boolean stackTrace = true;

    public ServiceAccessException(ErrorCode errorCode) {
        super(errorCode.getName());
        this.code = errorCode.getCode();
        stackTrace = false;
    }

    public ServiceAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public Throwable fillInStackTrace() {
        return stackTrace ? super.fillInStackTrace() : this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
