package com.atguigu.springcloud.feignservice.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.feignservice.PaymentService;
import com.atguigu.springcloud.dao.PaymentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int creat(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
