package com.diligrp.icard.card.domain;

import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 卡片权限数据模型-icard_card_permission
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public class CardPermissionDo extends BaseDo {
    /**
     * 用户账号ID
     */
    private Long accountId;
    /**
     * 每笔提现限额-分
     */
    private Long drawLimitsTimes;
    /**
     * 每日提现限额-分
     */
    private Long drawLimitsDays;
    /**
     * 每笔付款限额-分
     */
    private Long payLimitsTimes;
    /**
     * 每日付款限额-分
     */
    private Long payLimitsDays;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getDrawLimitsTimes() {
        return drawLimitsTimes;
    }

    public void setDrawLimitsTimes(Long drawLimitsTimes) {
        this.drawLimitsTimes = drawLimitsTimes;
    }

    public Long getDrawLimitsDays() {
        return drawLimitsDays;
    }

    public void setDrawLimitsDays(Long drawLimitsDays) {
        this.drawLimitsDays = drawLimitsDays;
    }

    public Long getPayLimitsTimes() {
        return payLimitsTimes;
    }

    public void setPayLimitsTimes(Long payLimitsTimes) {
        this.payLimitsTimes = payLimitsTimes;
    }

    public Long getPayLimitsDays() {
        return payLimitsDays;
    }

    public void setPayLimitsDays(Long payLimitsDays) {
        this.payLimitsDays = payLimitsDays;
    }
}