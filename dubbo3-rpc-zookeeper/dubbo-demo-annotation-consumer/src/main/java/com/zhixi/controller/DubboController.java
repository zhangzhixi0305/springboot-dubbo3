package com.zhixi.controller;

import com.zhixi.pojo.User;
import com.zhixi.service.DubboTestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-02-19 18:58
 */
@RestController
public class DubboController {

    @DubboReference
    private DubboTestService dubboTestService;

    /**
     * 测试访问地址：<a href="http://localhost:8082/sayHello?name=zs&age=23">...</a>
     *
     * @param name name
     * @param age  age
     * @return User
     */
    @GetMapping("/sayHello")
    public User sayHello(@RequestParam String name, @RequestParam Integer age) {
        return dubboTestService.sayHello(name, age);
    }
}
