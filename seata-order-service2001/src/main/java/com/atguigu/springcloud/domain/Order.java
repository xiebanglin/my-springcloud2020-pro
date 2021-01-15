package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: Order
 * @Author: xiebanglin
 * @Description: 订单
 * @Date: 2021/1/15 15:28
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private Integer status; //订单状态：0：创建中；1：已完结

}

