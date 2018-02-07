package com.diligrp.icard.card.domain;

import com.diligrp.icard.card.type.AccountStatus;
import com.diligrp.icard.card.type.AccountType;
import com.diligrp.icard.shared.domain.BaseDo;
import com.diligrp.icard.shared.type.Gender;

import java.time.LocalDateTime;

/**
 * 用户账户数据模型-icard_user_account
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public class UserAccountDo extends BaseDo {
    /**
     * 用户账号ID
     */
    private Long accountId;
    /**
     * 账号类型
     */
    private AccountType type;
    /**
     * 资金账号ID
     */
    private Long fundAccountId;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户性别
     */
    private Gender gender;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 电话号码
     */
    private String telphone;
    /**
     * 身份证号
     */
    private String idCode;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 登录密码
     */
    private String loginPwd;
    /**
     * 交易密码
     */
    private String tradePwd;
    /**
     * 是否强制修改密码
     */
    private Boolean pwdChanged;
    /**
     * 最近登录时间
     */
    private LocalDateTime loginTime;
    /**
     * 密匙-用户密码加密或卡片内业务信息加密
     */
    private String secretKey;
    /**
     * CRM系统客户ID
     */
    private Long customerId;
    /**
     * 账号状态
     */
    private AccountStatus status;
    /**
     * 数据版本
     */
    private Integer version;
    /**
     * 机构编码
     */
    private String instCode;
    /**
     * 机构名称
     */
    private String instName;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public Long getFundAccountId() {
        return fundAccountId;
    }

    public void setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getTradePwd() {
        return tradePwd;
    }

    public void setTradePwd(String tradePwd) {
        this.tradePwd = tradePwd;
    }

    public Boolean getPwdChanged() {
        return pwdChanged;
    }

    public void setPwdChanged(Boolean pwdChanged) {
        this.pwdChanged = pwdChanged;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
