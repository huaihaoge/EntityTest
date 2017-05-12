package com.thunisoft.chenh.entityExcel.pojo;

import java.util.Date;

public class EntityInfo {
    private Integer nId;

    private String cEntityId;

    private String cEntityName;

    private Long nFieldNumber;

    private Long nWrongNumber;

    private Date dLastTime;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getcEntityId() {
        return cEntityId;
    }

    public void setcEntityId(String cEntityId) {
        this.cEntityId = cEntityId == null ? null : cEntityId.trim();
    }

    public String getcEntityName() {
        return cEntityName;
    }

    public void setcEntityName(String cEntityName) {
        this.cEntityName = cEntityName == null ? null : cEntityName.trim();
    }

    public Long getnFieldNumber() {
        return nFieldNumber;
    }

    public void setnFieldNumber(Long nFieldNumber) {
        this.nFieldNumber = nFieldNumber;
    }

    public Long getnWrongNumber() {
        return nWrongNumber;
    }

    public void setnWrongNumber(Long nWrongNumber) {
        this.nWrongNumber = nWrongNumber;
    }

    public Date getdLastTime() {
        return dLastTime;
    }

    public void setdLastTime(Date dLastTime) {
        this.dLastTime = dLastTime;
    }
}