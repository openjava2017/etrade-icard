package com.diligrp.icard.fund.domain;

import com.diligrp.icard.fund.type.FinanceStatus;
import com.diligrp.icard.fund.type.FinanceType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 网点财务柜台交款领款数据模型-icard_finance_counter
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class FinanceCounterDo extends BaseDo {
    /**
     * 财务柜台ID
     */
    private Long counterId;
    /**
     * 财务类型-领款 交款
     */
    private FinanceType type;
    /**
     * 领款或缴款总金额-分
     */
    private Long amount;
    /**
     * 网点ID
     */
    private Long wstationId;
    /**
     * 操作人员
     */
    private Long employeeId;
    /**
     * 操作人员姓名
     */
    private String employeeName;
    /**
     * 财务状态
     */
    private FinanceStatus status;
    /**
     * 机构编码
     */
    private String instCode;
    /**
     * 机构名称
     */
    private String instName;
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

    public FinanceType getType() {
        return type;
    }

    public void setType(FinanceType type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getWstationId() {
        return wstationId;
    }

    public void setWstationId(Long wstationId) {
        this.wstationId = wstationId;
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

    public FinanceStatus getStatus() {
        return status;
    }

    public void setStatus(FinanceStatus status) {
        this.status = status;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
