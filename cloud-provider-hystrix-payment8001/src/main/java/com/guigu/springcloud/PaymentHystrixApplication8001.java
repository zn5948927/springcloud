package com.guigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-07-30 10:21
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixApplication8001.class, args);
    }
}