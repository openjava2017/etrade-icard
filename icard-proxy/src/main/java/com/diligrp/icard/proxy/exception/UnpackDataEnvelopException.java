package com.diligrp.icard.proxy.exception;

import com.diligrp.icard.shared.type.ErrorCode;

/**
 * 消息信封拆包异常
 *
 * @author: brenthuang
 * @date: 2018/01/08
 */
public class UnpackDataEnvelopException extends Exception {
    private int code;

    private boolean stackTrace = true;

    public UnpackDataEnvelopException(ErrorCode errorCode) {
        super(errorCode.getName());
        this.code = errorCode.getCode();
        this.stackTrace = false;
    }

    public UnpackDataEnvelopException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getName(), cause);
        this.code = errorCode.getCode();
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
