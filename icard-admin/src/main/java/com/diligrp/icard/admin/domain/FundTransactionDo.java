package com.diligrp.icard.admin.domain;

import com.diligrp.icard.admin.type.Channel;
import com.diligrp.icard.admin.type.TransactionStatus;
import com.diligrp.icard.admin.type.TransactionType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 资金事务数据模型-icard_fund_transaction
 *
 * @author: brenthuang
 * @date: 2018/01/15
 */
public class FundTransactionDo extends BaseDo {
    /**
     * 操作事务ID
     */
    private Long transactionId;
    /**
     * 事务类型
     */
    private TransactionType type;
    /**
     * 外部流水号-支付流水号
     */
    private String extSerialNo;
    /**
     * 目标业务流水号-冲正时使用
     */
    private String targetNo;
    /**
     * 账户期末余额 - 不包含冻结资金
     */
    private Long balance;
    /**
     * 冻结资金的期余额
     */
    private Long frozenAmount;
    /**
     * 资金渠道
     */
    private Channel channel;
    /**
     * 操作资金的原始金额-分，冲正后此字段不变
     */
    private Long maxAmount;
    /**
     * 操作的实际金额-分，冲正后此字段跟随冲正金额进行变化
     */
    private Long amount;
    /**
     * 费用总金额
     */
    private Long feeAmount;
    /**
     * 事务状态
     */
    private TransactionStatus status;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getExtSerialNo() {
        return extSerialNo;
    }

    public void setExtSerialNo(String extSerialNo) {
        this.extSerialNo = extSerialNo;
    }

    public String getTargetNo() {
        return targetNo;
    }

    public void setTargetNo(String targetNo) {
        this.targetNo = targetNo;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(Long frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}
