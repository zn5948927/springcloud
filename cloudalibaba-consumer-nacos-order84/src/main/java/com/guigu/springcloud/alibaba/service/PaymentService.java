package com.guigu.springcloud.alibaba.service;

import com.guigu.springcloud.entities.CommonResult;
import com.guigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 10:58
 **/
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
