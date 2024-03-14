package com.mixky.controller;

import com.mixky.pojo.User;
import com.mixky.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 15:07
 */
@RestController
@RequestMapping("/testServiceController")
public class TestServiceController {

    private ITestService testService;

    @Autowired
    public void setTestService(ITestService testService) {
        this.testService = testService;
    }

    /**
     * 对外访问接口：
     * 访问方式1：http://localhost:8083/testServiceController/sayHello
     * 访问方式2：http://localhost:8082/asc/api/iTestService/sayHello
     *
     * @return String
     */
    @GetMapping("sayHello")
    public String sayHello() {
        return testService.sagHello();
    }

    /**
     * 对外访问接口：
     * 访问方式1：http://localhost:8083/testServiceController/sayHelloMessage?message=zzx
     * 访问方式2：http://localhost:8082/asc/api/iTestService/sayHelloMessage?message=zzx
     *
     * @param message message
     * @return String
     */
    @GetMapping("sayHelloMessage")
    public String sayHelloMessage(String message) {
        return testService.sayHelloMessage(message);
    }


    /**
     * 对外访问接口：
     * 访问方式1：http://localhost:8083/testServiceController/getUserResult
     * 访问方式2：http://localhost:8082/asc/api/iTestService/getUserResult
     *
     * @param user user
     * @return User
     */
    @PostMapping("getUserResult")
    public User getUserResult(@RequestBody User user) {
        return testService.getUserResult(user);
    }
}
