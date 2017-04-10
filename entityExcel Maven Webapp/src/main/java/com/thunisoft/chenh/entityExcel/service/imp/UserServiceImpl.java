package com.thunisoft.chenh.entityExcel.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thunisoft.chenh.entityExcel.dao.IUserDao;
import com.thunisoft.chenh.entityExcel.pojo.User;
import com.thunisoft.chenh.entityExcel.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User getUserById(int userId) {
         
        return this.userDao.selectByPrimaryKey(userId);
    }


}
