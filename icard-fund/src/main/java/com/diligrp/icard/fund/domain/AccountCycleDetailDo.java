package com.diligrp.icard.fund.domain;

import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 对账周期明细数据模型-icard_account_cycle_detail
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class AccountCycleDetailDo extends BaseDo {
    /**
     * 账务周期流水号
     */
    private Long cycleNo;
    /**
     * 领款次数
     */
    private Integer receiveTimes;
    /**
     * 领款金额-分
     */
    private Long receiveAmount;
    /**
     * 交款次数
     */
    private Integer deliverTimes;
    /**
     * 交款金额-分
     */
    private Long deliverAmount;
    /**
     * 现金充值次数
     */
    private Integer depoCashTimes;
    /**
     * 现金充值金额-分
     */
    private Long depoCashAmount;
    /**
     * POS充值次数
     */
    private Integer depoPosTimes;
    /**
     * POS充值金额-分
     */
    private Long depoPosAmount;
    /**
     * 提现次数
     */
    private Integer drawCashTimes;
    /**
     * 提现金额-分
     */
    private Long drawCashAmount;
    /**
     * 转账次数
     */
    private Integer drawBankTimes;
    /**
     * 转账金额-分
     */
    private Long drawBankAmount;
    /**
     * 现金收益金额-分
     */
    private Long revenueAmount;

    public Long getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(Long cycleNo) {
        this.cycleNo = cycleNo;
    }

    public Integer getReceiveTimes() {
        return receiveTimes;
    }

    public void setReceiveTimes(Integer receiveTimes) {
        this.receiveTimes = receiveTimes;
    }

    public Long getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Long receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public Integer getDeliverTimes() {
        return deliverTimes;
    }

    public void setDeliverTimes(Integer deliverTimes) {
        this.deliverTimes = deliverTimes;
    }

    public Long getDeliverAmount() {
        return deliverAmount;
    }

    public void setDeliverAmount(Long deliverAmount) {
        this.deliverAmount = deliverAmount;
    }

    public Integer getDepoCashTimes() {
        return depoCashTimes;
    }

    public void setDepoCashTimes(Integer depoCashTimes) {
        this.depoCashTimes = depoCashTimes;
    }

    public Long getDepoCashAmount() {
        return depoCashAmount;
    }

    public void setDepoCashAmount(Long depoCashAmount) {
        this.depoCashAmount = depoCashAmount;
    }

    public Integer getDepoPosTimes() {
        return depoPosTimes;
    }

    public void setDepoPosTimes(Integer depoPosTimes) {
        this.depoPosTimes = depoPosTimes;
    }

    public Long getDepoPosAmount() {
        return depoPosAmount;
    }

    public void setDepoPosAmount(Long depoPosAmount) {
        this.depoPosAmount = depoPosAmount;
    }

    public Integer getDrawCashTimes() {
        return drawCashTimes;
    }

    public void setDrawCashTimes(Integer drawCashTimes) {
        this.drawCashTimes = drawCashTimes;
    }

    public Long getDrawCashAmount() {
        return drawCashAmount;
    }

    public void setDrawCashAmount(Long drawCashAmount) {
        this.drawCashAmount = drawCashAmount;
    }

    public Integer getDrawBankTimes() {
        return drawBankTimes;
    }

    public void setDrawBankTimes(Integer drawBankTimes) {
        this.drawBankTimes = drawBankTimes;
    }

    public Long getDrawBankAmount() {
        return drawBankAmount;
    }

    public void setDrawBankAmount(Long drawBankAmount) {
        this.drawBankAmount = drawBankAmount;
    }

    public Long getRevenueAmount() {
        return revenueAmount;
    }

    public void setRevenueAmount(Long revenueAmount) {
        this.revenueAmount = revenueAmount;
    }
}
