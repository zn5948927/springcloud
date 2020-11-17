package com.guigu.springcloud.alibaba.myhandler;

import com.guigu.springcloud.entities.CommonResult;
import com.sun.deploy.security.BlockedException;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-17 11:02
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockedException exception) {
        return new CommonResult(2020, "自定义限流信息。。。。");
    }
}
