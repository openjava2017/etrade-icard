package com.diligrp.icard.card.domain;

import com.diligrp.icard.card.type.RepositoryStatus;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 空白卡片数据模型-icard_card_repository
 *
 * @author: brenthuang
 * @date: 2018/01/15
 */
public class CardRepositoryDo extends BaseDo {
    /**
     * 卡片内码-硬件内读出
     */
    private String deviceId;
    /**
     * 卡号-硬件内读出
     */
    private String cardNo;
    /**
     * 卡片类型码-硬件内读出
     */
    private Integer typeCode;
    /**
     * 卡片校验码-硬件内读出
     */
    private String verifyCode;
    /**
     * 制卡程序版本
     */
    private Integer makerVersion;
    /**
     * 空白卡片状态
     */
    private RepositoryStatus status;
    /**
     * 入库人ID
     */
    private Long employeeId;
    /**
     * 入库人姓名
     */
    private String employeeName;
    /**
     * 市场编码-硬件内读出，制卡时写入
     */
    private String ownerCode;
    /**
     * 卡片发行/所属市场编码
     */
    private String instCode;
    /**
     * 卡片发行/所属市场名称
     */
    private String instName;

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

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getMakerVersion() {
        return makerVersion;
    }

    public void setMakerVersion(Integer makerVersion) {
        this.makerVersion = makerVersion;
    }

    public RepositoryStatus getStatus() {
        return status;
    }

    public void setStatus(RepositoryStatus status) {
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

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
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
