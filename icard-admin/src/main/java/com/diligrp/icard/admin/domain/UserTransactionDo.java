package com.diligrp.icard.admin.domain;

import com.diligrp.icard.admin.type.TransactionStatus;
import com.diligrp.icard.admin.type.TransactionType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 柜员操作事务日志模型-icard_user_transaction
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public class UserTransactionDo extends BaseDo {
    /**
     * 操作事务ID
     */
    private Long transactionId;
    /**
     * 业务流水号
     */
    private String serialNo;
    /**
     * 操作事务类型
     */
    private TransactionType type;
    /**
     * 操作子类型-用于细分事务类型，比如充值（POS充值，现金充值）
     */
    private TransactionType subType;
    /**
     * 柜员对账周期流水号
     */
    private Long cycleNo;
    /**
     * 卡账号ID
     */
    private Long accountId;
    /**
     * 卡片ID
     */
    private Long cardId;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 换卡业务的新卡ID
     */
    private Long newCardId;
    /**
     * 换卡业务的新卡卡号
     */
    private String newCardNo;
    /**
     * 退卡业务用于标记是否退还卡片
     */
    private Boolean returned;
    /**
     * 操作事务状态
     */
    private TransactionStatus status;
    /**
     * 操作人员ID
     */
    private Long employeeId;
    /**
     * 操作人员姓名
     */
    private String employeeName;
    /**
     * 用户工位ID
     */
    private Long ustationId;
    /**
     * 机构编码
     */
    private String instCode;
    /**
     * 机构名称
     */
    private String instName;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public TransactionType getSubType() {
        return subType;
    }

    public void setSubType(TransactionType subType) {
        this.subType = subType;
    }

    public Long getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(Long cycleNo) {
        this.cycleNo = cycleNo;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Long getNewCardId() {
        return newCardId;
    }

    public void setNewCardId(Long newCardId) {
        this.newCardId = newCardId;
    }

    public String getNewCardNo() {
        return newCardNo;
    }

    public void setNewCardNo(String newCardNo) {
        this.newCardNo = newCardNo;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
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

    public Long getUstationId() {
        return ustationId;
    }

    public void setUstationId(Long ustationId) {
        this.ustationId = ustationId;
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
