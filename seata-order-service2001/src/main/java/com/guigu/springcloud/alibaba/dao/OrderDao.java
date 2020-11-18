package com.guigu.springcloud.alibaba.dao;

import com.guigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud
 * @description
 * @author: Zuo Ning
 * @create: 2020-11-18 16:39
 **/
@Mapper
public interface OrderDao {
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
