package com.zhixi.service;

import com.zhixi.pojo.User;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-02-19 17:57
 */
public interface DubboTestService {

    /**
     * sayHello
     *
     * @param name name
     * @return String
     */
    User sayHello(String name, Integer age);
}
