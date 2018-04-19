package com.ssm.cn.dao;

import com.ssm.cn.entity.User;

import java.util.List;

public interface UserDao {

    /*查询所有用户信息*/
    List<User> getUserInfo();

}
