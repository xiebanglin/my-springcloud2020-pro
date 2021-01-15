package com.atguigu.springcloud.feign;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.feign
 * @ClassName: AccountService
 * @Author: xiebanglin
 * @Description:
 * @Date: 2021/1/15 15:35
 * @Version: 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService{
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}