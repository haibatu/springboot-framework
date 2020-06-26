package com.hbt.springboot.springbootframework.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 异步处理服务
 */
@Slf4j
@Service
public class TestAsyncService {

    @Async("getAsyncExecutor")
    public void async1() throws InterruptedException{
        log.info("async1 -> "+Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
    }

    @Async("getAsyncExecutor")
    public Future<Integer> async2() throws InterruptedException{
        log.info("async2 -> "+Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return new AsyncResult<>(100);
    }

}
