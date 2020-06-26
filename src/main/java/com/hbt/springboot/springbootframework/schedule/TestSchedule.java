package com.hbt.springboot.springbootframework.schedule;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

/**
 * 定时任务
 */
@Slf4j
@Component
public class TestSchedule {

    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

    //上一次任务结束后三秒后执行
    @Scheduled(fixedDelay = 3000)
    public void schedule1(){
        System.out.println("schedule1 -> ");
    }

    //上一次任务开始三秒后执行
    @Scheduled(fixedRate = 3000)
    public void schedule2(){
        System.out.println("schedule2 -> ");
    }

    //第一次延迟两秒执行  ，之后每三秒执行一次
    @Scheduled(initialDelay = 2000, fixedRate = 3000)
    public void schedule3(){
        System.out.println("schedule3 -> ");
    }

    //每三秒执行一次
    @Scheduled(cron = "*/3 * * * * ?")
    public void schedule4(){
        System.out.println("schedule4 -> ");
    }
}
