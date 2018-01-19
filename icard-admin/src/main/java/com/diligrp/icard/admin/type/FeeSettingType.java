package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 费用类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum FeeSettingType implements IEnumType {
    TRANSACT_CARD("开卡费用", 11),

    RETURN_CARD("退卡费用", 12),

    POUNDAGE("手续费", 13);

    private String name;
    private int code;

    FeeSettingType(String name, int code) {
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
