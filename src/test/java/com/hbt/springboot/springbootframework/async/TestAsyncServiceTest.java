package com.hbt.springboot.springbootframework.async;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 异步服务功能测试
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class TestAsyncServiceTest {

    @Autowired
    TestAsyncService service;

    @Test
    void async1() throws InterruptedException {
        service.async1();
        log.info("async1");
    }

    @Test
    void async2() throws Exception {
        Future<Integer> result = service.async2();
        log.info("async2");
        log.info("value:{}",result.get());
        log.info("value:{}",result.get(1, TimeUnit.SECONDS));

    }
}