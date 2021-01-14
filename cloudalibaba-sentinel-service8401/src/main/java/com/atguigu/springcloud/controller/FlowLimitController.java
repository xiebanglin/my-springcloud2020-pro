package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sun.deploy.security.BlockedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + ".....testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
//        log.info("testD 测试RT");
        log.info("测试异常比例");
        int i = 1 / 0;
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1, @RequestParam(value = "p2", required = false) String p2) {
//        int age = 10 / 0;
        return "-------testHotKey ";
    }

    public String deal_testHotKey(String p1, String p2, BlockException blockException) {
        return "-------deal_testHotKey_::>_<::";
    }


}
