package com.diligrp.icard.fund.domain;

import com.diligrp.icard.fund.type.FinanceStatus;
import com.diligrp.icard.fund.type.FinanceType;
import com.diligrp.icard.shared.domain.BaseDo;

import java.util.Date;

/**
 * 银行存取款数据模型-icard_bank_counter
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class BankCounter extends BaseDo {
    /**
     * 银行操作流水号
     */
    private String serialNo;
    /**
     * 财务类型-存款 取款
     */
    private FinanceType type;
    /**
     * 存取款操作金额
     */
    private Long amount;
    /**
     * 存取款实际操作时间
     */
    private Date applyTime;
    /**
     * 操作人员
     */
    private Long employeeId;
    /**
     * 操作人员名称
     */
    private String employeeName;
    /**
     * 财务状态
     */
    private FinanceStatus status;
    /**
     * 园区编码
     */
    private String instCode;
    /**
     * 园区名称
     */
    private String instName;
    /**
     * 备注
     */
    private String description;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
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

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
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
