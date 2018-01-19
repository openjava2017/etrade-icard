package com.diligrp.icard.card.domain;

import com.diligrp.icard.card.type.CardType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 卡片类型权限数据模型-icard_type_permission
 *
 * @author: brenthuang
 * @date: 2018/01/12
 */
public class TypePermissionDo extends BaseDo {
    /**
     * 卡片类型
     */
    private CardType type;
    /**
     * 每笔提现限额-分
     */
    private Long drawLimitsTimes;
    /**
     * 最高每笔提现限额-分
     */
    private Long maxDrawLimitsTimes;
    /**
     * 每日提现限额-分
     */
    private Long drawLimitsDays;
    /**
     * 最高每日提现限额-分
     */
    private Long maxDrawLimitsDays;
    /**
     * 每笔付款限额-分
     */
    private Long payLimitsTimes;
    /**
     * 最高每笔付款限额-分
     */
    private Long maxPayLimitsTimes;
    /**
     * 每日付款限额-分
     */
    private Long payLimitsDays;
    /**
     * 最高每日付款限额-分
     */
    private Long maxPayLimitsDays;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public Long getDrawLimitsTimes() {
        return drawLimitsTimes;
    }

    public void setDrawLimitsTimes(Long drawLimitsTimes) {
        this.drawLimitsTimes = drawLimitsTimes;
    }

    public Long getMaxDrawLimitsTimes() {
        return maxDrawLimitsTimes;
    }

    public void setMaxDrawLimitsTimes(Long maxDrawLimitsTimes) {
        this.maxDrawLimitsTimes = maxDrawLimitsTimes;
    }

    public Long getDrawLimitsDays() {
        return drawLimitsDays;
    }

    public void setDrawLimitsDays(Long drawLimitsDays) {
        this.drawLimitsDays = drawLimitsDays;
    }

    public Long getMaxDrawLimitsDays() {
        return maxDrawLimitsDays;
    }

    public void setMaxDrawLimitsDays(Long maxDrawLimitsDays) {
        this.maxDrawLimitsDays = maxDrawLimitsDays;
    }

    public Long getPayLimitsTimes() {
        return payLimitsTimes;
    }

    public void setPayLimitsTimes(Long payLimitsTimes) {
        this.payLimitsTimes = payLimitsTimes;
    }

    public Long getMaxPayLimitsTimes() {
        return maxPayLimitsTimes;
    }

    public void setMaxPayLimitsTimes(Long maxPayLimitsTimes) {
        this.maxPayLimitsTimes = maxPayLimitsTimes;
    }

    public Long getPayLimitsDays() {
        return payLimitsDays;
    }

    public void setPayLimitsDays(Long payLimitsDays) {
        this.payLimitsDays = payLimitsDays;
    }

    public Long getMaxPayLimitsDays() {
        return maxPayLimitsDays;
    }

    public void setMaxPayLimitsDays(Long maxPayLimitsDays) {
        this.maxPayLimitsDays = maxPayLimitsDays;
    }
}
