package com.ssm.cn.service.impl;

import com.ssm.cn.dao.UserDao;
import com.ssm.cn.entity.User;
import com.ssm.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.getUserInfo();
    }
}
