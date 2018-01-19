package com.diligrp.icard.admin.domain;

import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 网点数据模型-icard_work_station
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class WorkStationDo extends BaseDo {
    /**
     * 网点名称
     */
    private String name;
    /**
     * 网点编码
     */
    private String code;
    /**
     * 网点资金预警金额-分
     */
    private Long warnAmount;
    /**
     * 网点工位数量
     */
    private Integer stationCount;
    /**
     * 所属机构编码
     */
    private String instCode;
    /**
     * 所属机构名称
     */
    private String instName;
    /**
     * 备注
     */
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getWarnAmount() {
        return warnAmount;
    }

    public void setWarnAmount(Long warnAmount) {
        this.warnAmount = warnAmount;
    }

    public Integer getStationCount() {
        return stationCount;
    }

    public void setStationCount(Integer stationCount) {
        this.stationCount = stationCount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
