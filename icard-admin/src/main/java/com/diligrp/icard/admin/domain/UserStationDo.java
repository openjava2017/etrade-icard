package com.diligrp.icard.admin.domain;

import com.diligrp.icard.admin.type.StationStatus;
import com.diligrp.icard.admin.type.StationType;
import com.diligrp.icard.shared.domain.BaseDo;

/**
 * 用户工位数据模型-icard_user_station
 *
 * @author: brenthuang
 * @date: 2018/01/16
 */
public class UserStationDo extends BaseDo {
    /**
     * 网点ID
     */
    private Long wstationId;
    /**
     * 工位编码
     */
    private String code;
    /**
     * 工位类型-总收银 柜员
     */
    private StationType type;
    /**
     * 账务周期流水号
     */
    private Long cycleNo;
    /**
     * 工位现金柜
     */
    private Long cashBox;
    /**
     * 员工ID
     */
    private Long employeeId;
    /**
     * 员工名称
     */
    private String employeeName;
    /**
     * 工位状态
     */
    private StationStatus status;
    /**
     * 数据版本号
     */
    private Integer version;
    /**
     * 备注
     */
    private String description;

    public Long getWstationId() {
        return wstationId;
    }

    public void setWstationId(Long wstationId) {
        this.wstationId = wstationId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public StationType getType() {
        return type;
    }

    public void setType(StationType type) {
        this.type = type;
    }

    public Long getCycleNo() {
        return cycleNo;
    }

    public void setCycleNo(Long cycleNo) {
        this.cycleNo = cycleNo;
    }

    public Long getCashBox() {
        return cashBox;
    }

    public void setCashBox(Long cashBox) {
        this.cashBox = cashBox;
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

    public StationStatus getStatus() {
        return status;
    }

    public void setStatus(StationStatus status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
