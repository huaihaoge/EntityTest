package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.DBInfo;

public interface IDBInfoDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(DBInfo record);

    int insertSelective(DBInfo record);

    DBInfo selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DBInfo record);

    int updateByPrimaryKey(DBInfo record);
}