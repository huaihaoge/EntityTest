package com.thunisoft.chenh.entityExcel.dao;

import com.thunisoft.chenh.entityExcel.pojo.EntityInfo;

public interface IEntityInfoDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(EntityInfo record);

    int insertSelective(EntityInfo record);

    EntityInfo selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(EntityInfo record);

    int updateByPrimaryKey(EntityInfo record);
}