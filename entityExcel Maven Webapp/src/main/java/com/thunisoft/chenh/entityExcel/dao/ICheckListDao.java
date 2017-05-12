package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.CheckList;

public interface ICheckListDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(CheckList record);

    int insertSelective(CheckList record);

    CheckList selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(CheckList record);

    int updateByPrimaryKey(CheckList record);
}