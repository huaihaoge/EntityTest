package com.thunisoft.chenh.entityExcel.pojo;

public class TestList {
    private Integer nId;

    private String cEntityId;

    private Integer nTotalfield;

    private Integer nErrorfield;

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

    public Integer getnTotalfield() {
        return nTotalfield;
    }

    public void setnTotalfield(Integer nTotalfield) {
        this.nTotalfield = nTotalfield;
    }

    public Integer getnErrorfield() {
        return nErrorfield;
    }

    public void setnErrorfield(Integer nErrorfield) {
        this.nErrorfield = nErrorfield;
    }
}