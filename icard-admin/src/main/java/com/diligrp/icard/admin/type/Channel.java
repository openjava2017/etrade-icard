package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 资金渠道枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum Channel implements IEnumType {
    CASH("现金", 1),

    ACCOUNT("园区账户", 2),

    POS("POS", 3),

    ICBC("工商银行", 10);

    private String name;
    private int code;

    Channel(String name, int code) {
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
