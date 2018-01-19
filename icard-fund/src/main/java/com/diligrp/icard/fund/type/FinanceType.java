package com.diligrp.icard.fund.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 网点财务类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum FinanceType implements IEnumType {
    TAKEOUT("领款", 1),

    HANDIN("交款", 2),

    DEPOSIT("存款", 3),

    WITHDRAW("取款", 4);

    private String name;
    private int code;

    FinanceType(String name, int code) {
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
