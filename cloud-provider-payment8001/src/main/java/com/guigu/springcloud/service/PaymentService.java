package com.guigu.springcloud.service;

import com.guigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
public interface PaymentService {
    /**
     * 添加
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
