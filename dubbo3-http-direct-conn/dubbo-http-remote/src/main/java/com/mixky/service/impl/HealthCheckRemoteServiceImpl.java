package com.mixky.service.impl;

import com.mixky.service.IHealthCheckService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-15 9:59
 */
@Service
@RequestMapping("/healthCheckRemoteServiceImpl")
public class HealthCheckRemoteServiceImpl implements IHealthCheckService {


    @DubboReference(interfaceClass = IHealthCheckService.class, url = "${rfwm.dubbo.remote.path}")
    IHealthCheckService healthCheckService;

    @Override
    public String healthCheck() {
        return healthCheckService.healthCheck();
    }
}
