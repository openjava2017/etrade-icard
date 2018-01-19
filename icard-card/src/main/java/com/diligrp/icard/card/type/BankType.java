package com.diligrp.icard.card.type;

import com.diligrp.icard.shared.type.IEnumType;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 银行卡类型枚举类
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public enum BankType implements IEnumType {

    ICBC("工商银行", "ICBC", 10),

    CCB("建设银行", "CCB", 11),

    BOC("中国银行", "BOC", 12),

    ABC("中国农业银行", "ABC", 13),

    BCM("交通银行", "BCM", 14),

    BOSJ("盛京银行", "BOSJ", 15),

    CITIC("中信银行", "CITIC", 16),

    BOHRB("哈尔滨银行", "BOHRB", 17),

    BOLJ("龙江银行", "BOLJ", 18),

    PSBC("邮政储蓄银行", "PSBC", 19),

    GRCB("贵阳农商银行", "GZNX", 20);

    private static final Stream<BankType> BANKS = Stream.of(BankType.values());

    private String name;
    private String label;
    private int code;

    BankType(String name, String label, int code) {
        this.name = name;
        this.label = label;
        this.code = code;
    }

    public static BankType getBankType(int code) {
        Optional<BankType> result = BANKS.filter(bank -> bank.getCode() == code).findFirst();
        return result.isPresent() ? result.get() : null;
    }

    public static BankType getBankType(String label) {
        Optional<BankType> result = BANKS.filter(bank -> bank.getLabel().equals(label)).findFirst();
        return result.isPresent() ? result.get() : null;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return getName();
    }
}
