package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 费用类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum FeeType implements IEnumType {
    COST("工本费", 11),

    PLEDGE("押金", 12),

    POUNDAGE("手续费", 13);

    private String name;
    private int code;

    FeeType(String name, int code) {
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
