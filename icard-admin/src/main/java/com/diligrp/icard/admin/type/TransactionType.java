package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 用户操作类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum TransactionType implements IEnumType {

    DEPOSIT("充值", 10),

    WITHDRAW("取款", 20),

    DEPOSIT_POS("POS充值", 1010),

    DEPOSIT_CASH("现金充值", 1011);

    private String name;
    private int code;

    TransactionType(String name, int code) {
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
