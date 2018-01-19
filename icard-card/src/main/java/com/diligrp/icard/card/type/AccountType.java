package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 卡账户类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum AccountType implements IEnumType {

    PERSONAL("个人账户", 10),

    PUBLIC("对公账户", 20);

    private String name;
    private int code;

    AccountType(String name, int code) {
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
