package com.diligrp.icard.card.domain;

import com.diligrp.icard.card.type.CardCategory;
import com.diligrp.icard.card.type.CardStatus;
import com.diligrp.icard.card.type.CardType;
import com.diligrp.icard.shared.domain.BaseDo;

import java.util.Date;

/**
 * 卡片信息模型-icard_user_card
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public class UserCardDo extends BaseDo {
    /**
     * 卡片主键
     */
    private Long cardId;
    /**
     * 卡片内码
     */
    private String deviceId;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 卡片类别
     */
    private CardCategory category;
    /**
     * 卡片类型
     */
    private CardType type;
    /**
     * 卡片类型码
     */
    private Integer typeCode;
    /**
     * 账户ID
     */
    private Long accountId;
    /**
     * 卡片校验码
     */
    private String verifyCode;
    /**
     * 卡片押金-分
     */
    private Long cashPledge;
    /**
     * 解锁时间
     */
    private Date relieveLockTime;
    /**
     * 解挂时间
     */
    private Date relieveLossTime;
    /**
     * 卡片序列号-换卡时自动加一
     */
    private Integer sequence;
    /**
     * 卡片状态
     */
    private CardStatus status;
    /**
     * 数据版本
     */
    private Integer version;
    /**
     * 开卡人
     */
    private Long employeeId;
    /**
     * 开卡人姓名
     */
    private String employeeName;
    /**
     * 机构编码
     */
    private String instCode;
    /**
     * 机构名称
     */
    private String instName;

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CardCategory getCategory() {
        return category;
    }

    public void setCategory(CardCategory category) {
        this.category = category;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Long getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(Long cashPledge) {
        this.cashPledge = cashPledge;
    }

    public Date getRelieveLockTime() {
        return relieveLockTime;
    }

    public void setRelieveLockTime(Date relieveLockTime) {
        this.relieveLockTime = relieveLockTime;
    }

    public Date getRelieveLossTime() {
        return relieveLossTime;
    }

    public void setRelieveLossTime(Date relieveLossTime) {
        this.relieveLossTime = relieveLossTime;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
