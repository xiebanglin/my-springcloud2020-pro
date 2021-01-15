package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Order;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: OrderService
 * @Author: xiebanglin
 * @Description:
 * @Date: 2021/1/15 15:33
 * @Version: 1.0
 */
public interface OrderService{
    void create(Order order);
}