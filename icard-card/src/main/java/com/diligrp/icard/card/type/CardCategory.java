package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 卡片类别枚举类型
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum CardCategory implements IEnumType {

    DILI_CARD("园区卡", 10),

    BANK_CARD("银行卡", 20);

    private String name;
    private int code;

    CardCategory(String name, int code) {
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
