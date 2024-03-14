package com.mixky.service.impl;

import com.mixky.pojo.User;
import com.mixky.service.ITestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 15:00
 */
@Service
@RequestMapping("/testServiceRemoteImpl")
public class TestServiceRemoteImpl implements ITestService {

    @DubboReference(interfaceClass = ITestService.class, url = "${rfwm.dubbo.remote.path}")
    ITestService testService;

    @Override
    public String sagHello() {
        return testService.sagHello();
    }

    @Override
    public String sayHelloMessage(String message) {
        return testService.sayHelloMessage(message);
    }

    @Override
    public User getUserResult(User user) {
        return testService.getUserResult(user);
    }
}
