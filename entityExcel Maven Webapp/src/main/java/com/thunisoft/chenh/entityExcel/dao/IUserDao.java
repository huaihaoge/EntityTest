package com.thunisoft.chenh.entityExcel.dao;

import org.springframework.stereotype.Component;

import com.thunisoft.chenh.entityExcel.pojo.User;

@Component("userDao")
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}