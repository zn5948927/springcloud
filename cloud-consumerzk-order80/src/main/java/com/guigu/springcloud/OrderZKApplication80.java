package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-07-21 17:00
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKApplication80.class, args);
    }
}
