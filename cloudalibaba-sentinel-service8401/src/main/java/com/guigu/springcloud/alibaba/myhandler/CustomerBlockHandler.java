package com.guigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.guigu.springcloud.entities.CommonResult;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-17 11:02
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流信息。。。。");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4040, "自定义限流信息。。。。");
    }
}
