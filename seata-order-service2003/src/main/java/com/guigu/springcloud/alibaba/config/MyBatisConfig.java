package com.guigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-19 09:43
 **/
@Configuration
@MapperScan({"com.guigu.springcloud.alibaba.dao"})
public class MyBatisConfig {

}