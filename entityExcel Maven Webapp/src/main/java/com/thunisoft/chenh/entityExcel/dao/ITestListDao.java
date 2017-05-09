package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.TestList;

public interface ITestListDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(TestList record);

    int insertSelective(TestList record);

    TestList selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(TestList record);

    int updateByPrimaryKey(TestList record);
}