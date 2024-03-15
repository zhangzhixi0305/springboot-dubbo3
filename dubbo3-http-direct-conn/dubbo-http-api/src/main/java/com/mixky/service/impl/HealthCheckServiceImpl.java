package com.mixky.service.impl;

import com.mixky.service.IHealthCheckService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-15 9:58
 */

@Service
@DubboService(interfaceClass = IHealthCheckService.class)
public class HealthCheckServiceImpl implements IHealthCheckService {
    @Override
    public String healthCheck() {
        return "ok";
    }
}
