package com.hbt.springboot.springbootframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用启动入口
 */
@EnableAsync//开启异步任务
@SpringBootApplication
@EnableScheduling//开启定时任务
public class SpringbootFrameworkApplication {

    public static void main(String[] args) {
        //启动方式
        //1.通过静态run方法
        SpringApplication.run(SpringbootFrameworkApplication.class, args);
/*

        //2.通过api调整应用型为
        SpringApplication application =
                new SpringApplication(SpringbootFrameworkApplication.class);

        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);

        //3.SpringApplicationBuilder Fluent API 链式调用
        new SpringApplicationBuilder(SpringbootFrameworkApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.NONE)
                .run(args);
*/

    }
}
