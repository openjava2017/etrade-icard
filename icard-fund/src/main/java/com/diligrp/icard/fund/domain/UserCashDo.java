package com.diligrp.icard.fund.domain;

import com.diligrp.icard.fund.type.FinanceStatus;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 柜员交款领款数据模型-icard_user_cash
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class UserCashDo extends BaseDo {
    /**
     * 财务柜台ID
     */
    private Long counterId;
    /**
     * 用户工位
     */
    private Long ustationId;
    /**
     * 领款或交款人
     */
    private Long employeeId;
    /**
     * 领款或交款人姓名
     */
    private String employeeName;
    /**
     * 账务周期流水号
     */
    private Long cycleNo;
    /**
     * 领款或交款金额-分
     */
    private Long amount;
    /**
     * 财务状态
     */
    private FinanceStatus status;
    /**
     * 备注
     */
    private String description;

    public Long getCounterId() {
        return counterId;
    }

    public void setCounterId(Long counterId) {
        this.counterId = counterId;
    }

    public Long getUstationId() {
        return ustationId;
    }

    public void setUstationId(Long ustationId) {
        this.ustationId = ustationId;
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

    public Long getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(Long cycleNo) {
        this.cycleNo = cycleNo;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public FinanceStatus getStatus() {
        return status;
    }

    public void setStatus(FinanceStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
