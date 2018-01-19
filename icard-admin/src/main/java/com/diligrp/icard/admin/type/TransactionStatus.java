package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 操作事务状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum TransactionStatus implements IEnumType {

    STATUS_PENDING("待处理", 0),

    STATUS_PROGRESS("处理中", 1),

    STATUS_COMPLETE("完成", 2),

    STATUS_FAILED("失败", 3);

    private String name;
    private int code;

    TransactionStatus(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
