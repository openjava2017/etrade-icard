package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 园区卡-银行卡绑定状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum BindStatus implements IEnumType {
    NORMAL("正常", 1),

    INVALID("失效", 0);

    private String name;
    private int code;

    BindStatus(String name, int code) {
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
