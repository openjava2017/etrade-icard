package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 卡片状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum CardStatus implements IEnumType {
    NORMAL("正常", 1),

    LOCKED("锁定", 2),

    LOST("挂失", 3),

    VOID("退还", 4);

    private String name;
    private int code;

    CardStatus(String name, int code) {
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
