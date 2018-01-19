package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 账户状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum AccountStatus implements IEnumType {
    NORMAL("正常", 1),

    LOCKED("锁定", 2),

    LOST("挂失", 3),

    LOGOFF("注销", 4);

    private String name;
    private int code;

    AccountStatus(String name, int code) {
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
