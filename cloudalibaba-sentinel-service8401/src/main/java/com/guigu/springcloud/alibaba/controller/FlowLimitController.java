package com.guigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-16 11:02
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
//        try {
//            TimeUnit.MICROSECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info(Thread.currentThread().getName() + "\t" + "....testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.MICROSECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testD";
    }
}

