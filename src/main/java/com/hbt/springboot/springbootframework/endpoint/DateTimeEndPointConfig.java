package com.hbt.springboot.springbootframework.endpoint;


import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义端点配置类
 */
@Configuration
public class DateTimeEndPointConfig {

    /**
     * 当bean缺少时才注入
     * @return
     */
    @Bean
    @ConditionalOnMissingBean//条件注解
    @ConditionalOnEnabledEndpoint
    public DateTimeEndPoint dateTimeEndPoint(){
        return new DateTimeEndPoint();
    }
}
