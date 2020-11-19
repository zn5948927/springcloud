package com.guigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-19 09:39
 **/
public interface AccountService {


    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
