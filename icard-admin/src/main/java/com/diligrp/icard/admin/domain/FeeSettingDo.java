package com.diligrp.icard.admin.domain;

import com.diligrp.icard.admin.type.FeeType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 费用设置数据模型-icard_fee_setting
 *
 * @author: brenthuang
 * @date: 2018/01/15
 */
public class FeeSettingDo extends BaseDo {
    /**
     * 费用名称
     */
    private String name;
    /**
     * 费用设置类型-开卡费用
     */
    private Integer type;
    /**
     * 费用设置子类型-可以为卡片种类
     */
    private Integer subType;
    /**
     * 费用类型
     */
    private FeeType feeType;
    /**
     * 费用金额-分
     */
    private Long amount;
    /**
     * 费用在页面上可否编辑
     */
    private Boolean editable;
    /**
     * 组织机构编码
     */
    private String instCode;
    /**
     * 组织机构名称
     */
    private String instName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }
}
