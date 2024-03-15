package com.mixky.controller;

import com.mixky.service.IHealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-15 10:03
 */
@RequestMapping("/api")
@RestController
public class HealthCheckController {

    private IHealthCheckService healthCheckService;

    @Autowired
    public void setHealthCheckService(IHealthCheckService healthCheckService) {
        this.healthCheckService = healthCheckService;
    }

    /**
     * 访问地址：
     * 普通http：  http://localhost:8083/api/health/check.html
     * Dubbohttp：http://localhost:8082/api/health/check.html
     *
     * @return String
     */
    @GetMapping("/health/check.html")
    public String healthCheck() {
        return healthCheckService.healthCheck();
    }
}
