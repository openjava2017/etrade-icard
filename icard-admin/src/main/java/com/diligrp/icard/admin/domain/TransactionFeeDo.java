package com.diligrp.icard.admin.domain;

import com.diligrp.icard.admin.type.Channel;
import com.diligrp.icard.admin.type.FeeType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 操作事务费用数据模型-icard_transaction_fee
 *
 * @author: brenthuang
 * @date: 2018/01/15
 */
public class TransactionFeeDo extends BaseDo {
    /**
     * 操作事务ID
     */
    private Long transactionId;
    /**
     * 渠道类型-现金 账户余额 工商银行等
     */
    private Channel channel;
    /**
     * 金额-分(正值)
     */
    private Long amount;
    /**
     * 费用类型-手续费等
     */
    private FeeType type;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public FeeType getType() {
        return type;
    }

    public void setType(FeeType type) {
        this.type = type;
    }
}
