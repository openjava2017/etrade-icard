package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 工位类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum StationType implements IEnumType {
    CASHIER("总收银工位", 0),

    COUNTER("柜员工位", 1);

    private String name;
    private int code;

    StationType(String name, int code) {
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
