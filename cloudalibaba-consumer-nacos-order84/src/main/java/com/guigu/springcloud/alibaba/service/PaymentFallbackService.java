package com.guigu.springcloud.alibaba.service;

import com.guigu.springcloud.entities.CommonResult;
import com.guigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 10:59
 **/
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
