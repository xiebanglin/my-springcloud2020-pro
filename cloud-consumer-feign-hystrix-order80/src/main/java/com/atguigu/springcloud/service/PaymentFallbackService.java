package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        String fb = "---PaymentFallbackService--paymentInfo_OK";
        return fb;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        String fb = "---PaymentFallbackService--paymentInfo_TimeOut";
        return fb;
    }
}
