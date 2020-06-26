package com.hbt.springboot.springbootframework.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 程序启动时，可以添加执行操作，
 * 比如：给运维人员发送短信、邮件等
 *
 *
 * BootApplicationRunner比BootCommandLineRunner先执行
 */
//@Order(2)
@Slf4j
@Component
public class BootApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("this is BootApplicationRunner");
    }
}
