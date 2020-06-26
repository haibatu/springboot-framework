package com.hbt.springboot.springbootframework.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * jackson的配置
 * 例如每一个vo类中都需要时间类型转换，就需要都写一遍，很麻烦
 * 所以编写一个JacksonConfig类，用来配置信息
 *
 * 该类会所用于所有的序列化的类
 */
@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper getObjectMapper(){
        ObjectMapper om = new ObjectMapper();
        //序列化返回包含的字段
        om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return om;
    }
}
