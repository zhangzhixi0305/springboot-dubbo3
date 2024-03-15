package com.mixky.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-15 9:54
 */
@RequestMapping("/health")
public interface IHealthCheckService {

    /**
     * 健康检查
     *
     * @return String
     */
    @GetMapping("/check.html")
    String healthCheck();
}
