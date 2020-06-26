package com.hbt.springboot.springbootframework.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * BootApplicationRunner比BootCommandLineRunner先执行
 */

//@Order是用改变优先级的，也就是执行顺序
// 添加order后，BootCommandLineRunner会先执行，
//@Order(1)
@Slf4j
@Component
public class BootCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("this is BootCommandLineRunner");
    }
}
