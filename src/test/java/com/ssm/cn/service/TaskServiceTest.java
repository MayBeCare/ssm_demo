package com.ssm.cn.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TaskServiceTest {

    public static void main(String[] args) {
         System.out.println("启动spring容器");
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
    }
}