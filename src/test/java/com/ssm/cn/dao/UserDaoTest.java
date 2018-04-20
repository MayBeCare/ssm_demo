package com.ssm.cn.dao;

import com.ssm.cn.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by asus on 2018/04/20.
 *
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserInfo() {
        List<User> uList = userDao.getUserInfo();
        System.out.println(uList);
    }

    @Test
    public void updateUserInfo() {
        User user = null;
        List<User> uList = userDao.getUserInfo();
        if(uList.size() > 0){
            user = new User();
            user.setUserCode(uList.get(0).getUserCode());
            user.setUserName("John");
            user.setUserSex(1);

            userDao.updateUserInfo(user);
        }
    }
}