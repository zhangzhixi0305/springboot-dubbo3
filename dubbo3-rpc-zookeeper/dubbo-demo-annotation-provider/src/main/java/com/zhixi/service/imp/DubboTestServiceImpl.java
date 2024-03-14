package com.zhixi.service.imp;

import com.zhixi.pojo.User;
import com.zhixi.service.DubboTestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-02-19 17:59
 */
@Component
@DubboService
public class DubboTestServiceImpl implements DubboTestService {
    @Override
    public User sayHello(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
