package com.guigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud
 * @description 服务降级处理
 * @author: Zuo Ning
 * @create: 2020-09-02 16:16
 **/
@Component
public class PaymentHystrixFallBackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixFallBackService fall back-paymentInfo_OK, (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixFallBackService fall back-paymentInfo_TimeOut, (┬＿┬)";
    }
}
