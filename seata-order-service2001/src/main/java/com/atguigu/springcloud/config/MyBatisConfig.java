package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: MyBatisConfig
 * @Author: xiebanglin
 * @Description:
 * @Date: 2021/1/15 15:37
 * @Version: 1.0
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MyBatisConfig {

}
