package com.diligrp.icard.admin.type;

import com.diligrp.icard.shared.type.IEnumType;

/**
 * 用户工位状态枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum StationStatus implements IEnumType {

    LOCKED("系统锁定", 0),

    NORMAL("正常", 1),

    VOID("无效", 2);

    private String name;
    private int code;

    StationStatus(String name, int code) {
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
