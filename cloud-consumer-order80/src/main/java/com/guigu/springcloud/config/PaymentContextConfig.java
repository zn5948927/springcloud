package com.guigu.springcloud.config;

import com.guigu.springcloud.entities.CommonResult;
import com.guigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-07-21 09:58
 **/
//@FeignClient(name = "cloud-payment-service", configuration = PaymentContextConfig.class)
public interface PaymentContextConfig {

    /**
     * 用户是否领券(自定义卖场)
     *
     * @return
     */
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);

}
