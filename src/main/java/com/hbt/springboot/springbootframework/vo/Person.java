package com.hbt.springboot.springbootframework.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//忽略一组属性
@JsonIgnoreProperties({"address"})
public class Person {

    @JsonProperty
    private String name;

    private int age;

    //忽略属性
//    @JsonIgnore
    private String address;

    @JsonProperty("da")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
}
