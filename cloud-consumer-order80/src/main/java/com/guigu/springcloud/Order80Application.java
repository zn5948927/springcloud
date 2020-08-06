package com.guigu.springcloud;

import com.guigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-07-17 15:51
 **/
@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients({"com.guigu.springcloud.config"})
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class Order80Application {

    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class, args);
    }
}
