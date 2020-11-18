package com.guigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 17:52
 **/
@Mapper
public interface StorageDao {


    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}

