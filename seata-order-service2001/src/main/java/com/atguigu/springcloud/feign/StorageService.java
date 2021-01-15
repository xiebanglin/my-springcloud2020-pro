package com.atguigu.springcloud.feign;


import com.atguigu.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.feign
 * @ClassName: StorageService
 * @Author: xiebanglin
 * @Description:
 * @Date: 2021/1/15 15:34
 * @Version: 1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService{
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

