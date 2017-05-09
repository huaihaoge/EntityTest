package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.ConfInfo;

public interface IConfInfoDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(ConfInfo record);

    int insertSelective(ConfInfo record);

    ConfInfo selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ConfInfo record);

    int updateByPrimaryKey(ConfInfo record);
}