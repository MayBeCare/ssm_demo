package com.ssm.cn.web;

import com.ssm.cn.entity.User;
import com.ssm.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public String getUserInfo(Model model){
        List<User> uList = userService.queryAll();
        model.addAttribute("list", uList);
        return "userList";
    }
}
