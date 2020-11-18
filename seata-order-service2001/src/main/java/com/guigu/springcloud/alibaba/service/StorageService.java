package com.guigu.springcloud.alibaba.service;

import com.guigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 16:44
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
