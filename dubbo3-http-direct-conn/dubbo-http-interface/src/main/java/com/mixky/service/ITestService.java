package com.mixky.service;

import com.mixky.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 14:53
 */
@RequestMapping("/iTestService")
public interface ITestService {

    /**
     * sayHello
     *
     * @return String
     */
    @GetMapping("/sayHello")
    String sagHello();

    /**
     * sayHello
     *
     * @param message message
     * @return String
     */
    @GetMapping("/sayHelloMessage")
    String sayHelloMessage(@RequestParam("message") String message);

    /**
     * result user
     *
     * @param user user
     * @return User
     */
    @PostMapping("/getUserResult")
    User getUserResult(@RequestBody User user);
}
