package com.mixky.service.impl;

import com.mixky.pojo.User;
import com.mixky.service.ITestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 15:04
 */
@Service
@DubboService(interfaceClass = ITestService.class)
public class TestServiceApiImpl implements ITestService {

    @Override
    public String sagHello() {
        return "hello";
    }

    @Override
    public String sayHelloMessage(String message) {
        return "hello " + message;
    }

    @Override
    public User getUserResult(User user) {
        return user;
    }
}
