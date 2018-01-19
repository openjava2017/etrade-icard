package com.diligrp.icard.fund.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 对账周期状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum CycleStatus implements IEnumType {
    IDLE("空闲", 0),

    ACTIVE("活跃", 1),

    CHECKING("结账", 2),

    BALANCE("平账", 3);

    private String name;
    private int code;

    CycleStatus(String name, int code) {
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
