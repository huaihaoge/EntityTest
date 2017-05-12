package com.thunisoft.chenh.entityExcel.pojo;

import java.util.Date;

public class CheckList {
    private Integer nId;

    private String cCheckItem;

    private String nExpectedResults;

    private Date dLastTime;

    private String nActualResults;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getcCheckItem() {
        return cCheckItem;
    }

    public void setcCheckItem(String cCheckItem) {
        this.cCheckItem = cCheckItem == null ? null : cCheckItem.trim();
    }

    public String getnExpectedResults() {
        return nExpectedResults;
    }

    public void setnExpectedResults(String nExpectedResults) {
        this.nExpectedResults = nExpectedResults == null ? null : nExpectedResults.trim();
    }

    public Date getdLastTime() {
        return dLastTime;
    }

    public void setdLastTime(Date dLastTime) {
        this.dLastTime = dLastTime;
    }

    public String getnActualResults() {
        return nActualResults;
    }

    public void setnActualResults(String nActualResults) {
        this.nActualResults = nActualResults == null ? null : nActualResults.trim();
    }
}