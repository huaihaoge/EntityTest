package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.SqlInfo;

public interface ISqlInfoDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(SqlInfo record);

    int insertSelective(SqlInfo record);

    SqlInfo selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(SqlInfo record);

    int updateByPrimaryKey(SqlInfo record);
}