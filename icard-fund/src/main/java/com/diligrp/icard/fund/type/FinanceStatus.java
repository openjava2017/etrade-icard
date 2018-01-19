package com.diligrp.icard.fund.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 网点财务状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum FinanceStatus implements IEnumType {
    PENDING("待确认", 1),

    CHECKED("已核对", 2);

    private String name;
    private int code;

    FinanceStatus(String name, int code) {
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
