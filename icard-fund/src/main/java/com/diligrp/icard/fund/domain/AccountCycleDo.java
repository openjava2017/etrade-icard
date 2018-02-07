package com.diligrp.icard.fund.domain;

import com.diligrp.icard.fund.type.CycleStatus;
import com.diligrp.icard.shared.domain.BaseDo;

import java.time.LocalDateTime;

/**
 * 柜员对账周期数据模型-icard_account_cycle
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class AccountCycleDo extends BaseDo {
    /**
     * 柜员工位
     */
    private Long ustationId;
    /**
     * 员工ID
     */
    private Long employeeId;
    /**
     * 员工名称
     */
    private String employeeName;
    /**
     * 账务周期流水号
     */
    private Long cycleNo;
    /**
     * 账务开始时间
     */
    private LocalDateTime startTime;
    /**
     * 账务结束时间
     */
    private LocalDateTime endTime;
    /**
     * 平账时间
     */
    private LocalDateTime checkTime;
    /**
     * 账务状态
     */
    private CycleStatus status;
    /**
     * 交付现金金额-分
     */
    private Long cashAmount;
    /**
     * 审核员-平帐人员
     */
    private Long auditorId;
    /**
     * 审核员名称
     */
    private String auditorName;
    /**
     * 备注
     */
    private String description;

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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public CycleStatus getStatus() {
        return status;
    }

    public void setStatus(CycleStatus status) {
        this.status = status;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
