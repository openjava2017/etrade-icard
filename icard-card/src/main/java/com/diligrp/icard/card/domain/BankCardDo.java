package com.diligrp.icard.card.domain;

import com.diligrp.icard.card.type.AccountType;
import com.diligrp.icard.card.type.BankType;
import com.diligrp.icard.card.type.BindStatus;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 园区卡绑定银行卡数据模型-icard_bank_card
 *
 * @author: brenthuang
 * @date: 2018/01/15
 */
public class BankCardDo extends BaseDo {
    /**
     * 银行卡账号类型-个人还是对公
     */
    private AccountType accountType;
    /**
     * 用户账号
     */
    private Long accountId;
    /**
     * 资金账号
     */
    private Long fundAccountId;
    /**
     * 银行类型
     */
    private BankType type;
    /**
     * 银行卡号，或对公户账号
     */
    private String account;
    /**
     * 持卡人姓名
     */
    private String name;
    /**
     * 绑定状态
     */
    private BindStatus status;
    /**
     * 操作人员ID
     */
    private Long employeeId;
    /**
     * 操作人员姓名
     */
    private String employeeName;
    /**
     * 备注
     */
    private String description;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getFundAccountId() {
        return fundAccountId;
    }

    public void setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
    }

    public BankType getType() {
        return type;
    }

    public void setType(BankType type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BindStatus getStatus() {
        return status;
    }

    public void setStatus(BindStatus status) {
        this.status = status;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
