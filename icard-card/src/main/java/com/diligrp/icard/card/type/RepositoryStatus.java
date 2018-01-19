package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 空白卡片状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum RepositoryStatus implements IEnumType {
    USED("在用",0),

    ACTIVE("激活",1),

    VOID("作废",2);

    private String name;
    private int code;

    RepositoryStatus(String name, int code) {
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
