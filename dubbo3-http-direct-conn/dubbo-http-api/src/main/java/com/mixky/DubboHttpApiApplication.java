package com.mixky;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 15:24
 */
@SpringBootApplication
@EnableDubbo
public class DubboHttpApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboHttpApiApplication.class, args);
    }
}
