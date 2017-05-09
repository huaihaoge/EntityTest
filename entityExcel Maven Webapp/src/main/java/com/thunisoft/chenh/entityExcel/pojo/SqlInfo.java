package com.thunisoft.chenh.entityExcel.pojo;

public class SqlInfo {
    private Integer nId;

    private String cEntityId;

    private String cFieldId;

    private String cEntitySql;

    private String cEntityResult;

    private Integer nEntitySfError;

    private String cTestSql;

    private String cTestResult;

    private Integer nTestSfError;

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

    public String getcFieldId() {
        return cFieldId;
    }

    public void setcFieldId(String cFieldId) {
        this.cFieldId = cFieldId == null ? null : cFieldId.trim();
    }

    public String getcEntitySql() {
        return cEntitySql;
    }

    public void setcEntitySql(String cEntitySql) {
        this.cEntitySql = cEntitySql == null ? null : cEntitySql.trim();
    }

    public String getcEntityResult() {
        return cEntityResult;
    }

    public void setcEntityResult(String cEntityResult) {
        this.cEntityResult = cEntityResult == null ? null : cEntityResult.trim();
    }

    public Integer getnEntitySfError() {
        return nEntitySfError;
    }

    public void setnEntitySfError(Integer nEntitySfError) {
        this.nEntitySfError = nEntitySfError;
    }

    public String getcTestSql() {
        return cTestSql;
    }

    public void setcTestSql(String cTestSql) {
        this.cTestSql = cTestSql == null ? null : cTestSql.trim();
    }

    public String getcTestResult() {
        return cTestResult;
    }

    public void setcTestResult(String cTestResult) {
        this.cTestResult = cTestResult == null ? null : cTestResult.trim();
    }

    public Integer getnTestSfError() {
        return nTestSfError;
    }

    public void setnTestSfError(Integer nTestSfError) {
        this.nTestSfError = nTestSfError;
    }
}