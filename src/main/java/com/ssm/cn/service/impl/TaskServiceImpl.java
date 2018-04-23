package com.ssm.cn.service.impl;

import com.ssm.cn.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service("taskService")
public class TaskServiceImpl implements TaskService{

    @Override
    public void taskJob() {

        System.out.println("现在时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @Override
    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
