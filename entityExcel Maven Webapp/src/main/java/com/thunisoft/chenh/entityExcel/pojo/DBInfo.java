package com.thunisoft.chenh.entityExcel.pojo;

public class DBInfo {
    private Integer nId;

    private Integer nConfigureId;

    private Integer nType;

    private String cJdbc;

    private String cUsername;

    private String cPassword;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnConfigureId() {
        return nConfigureId;
    }

    public void setnConfigureId(Integer nConfigureId) {
        this.nConfigureId = nConfigureId;
    }

    public Integer getnType() {
        return nType;
    }

    public void setnType(Integer nType) {
        this.nType = nType;
    }

    public String getcJdbc() {
        return cJdbc;
    }

    public void setcJdbc(String cJdbc) {
        this.cJdbc = cJdbc == null ? null : cJdbc.trim();
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }
}