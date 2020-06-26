package com.hbt.springboot.springbootframework.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hbt.springboot.springbootframework.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/testcontroller")
public class TestController {

    @Autowired
    private ObjectMapper om;

    @GetMapping("/test")
    public void test(){

    }

    @GetMapping("/jackson")
    public Person jackson() throws Exception{
        Person person = Person.builder()
                .name("hbt")
                .age(1)
                .address("beijing")
                .date(new Date())
                .build();
        //序列化
        String json = om.writeValueAsString(person);
        log.info("Person jackson -> {}",json);

        //反序列化
        return om.readValue(json, Person.class);
    }
}
