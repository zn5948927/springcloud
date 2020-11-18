package com.guigu.springcloud.alibaba.controller;

import com.guigu.springcloud.alibaba.domain.CommonResult;
import com.guigu.springcloud.alibaba.domain.Order;
import com.guigu.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 16:45
 **/
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}

