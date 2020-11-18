package com.guigu.springcloud.alibaba.service;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 17:53
 **/
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
