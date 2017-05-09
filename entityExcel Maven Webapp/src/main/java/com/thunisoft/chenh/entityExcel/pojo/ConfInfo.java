package com.thunisoft.chenh.entityExcel.pojo;

import java.util.Date;

public class ConfInfo {
    private Integer nId;

    private String cName;

    private String cNotes;

    private Date dTime;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcNotes() {
        return cNotes;
    }

    public void setcNotes(String cNotes) {
        this.cNotes = cNotes == null ? null : cNotes.trim();
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }
}