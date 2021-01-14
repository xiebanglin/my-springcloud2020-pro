package com.atguigu.springcloud.myhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.myhandle
 * @ClassName: CustomerBlockHandler
 * @Author: xiebanglin
 * @Description: 自定义限流规则
 * @Date: 2021/1/14 13:58
 * @Version: 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息2....CustomerBlockHandler--2");
    }
}
