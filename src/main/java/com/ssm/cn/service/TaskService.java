package com.ssm.cn.service;

/**
 * 定时任务
 */
public interface TaskService {

    void taskJob();

    String getTime();
}
