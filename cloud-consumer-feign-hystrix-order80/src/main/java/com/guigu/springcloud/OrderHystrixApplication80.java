package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-08-27 10:27
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication80.class, args);
    }
}
