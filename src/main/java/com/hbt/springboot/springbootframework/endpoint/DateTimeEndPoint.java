package com.hbt.springboot.springbootframework.endpoint;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义监控端点,id不能和系统的重复
 */
@Endpoint(id = "datetime")//表明是一个自定义监控
public class DateTimeEndPoint {

    private String format = "yyyy-MM-dd HH:mm:ss";
    /**
     * 显示监控指标
     * localhost:8080/framework/actuator/datetime  自定义
     * @return
     */
    @ReadOperation
    public Map<String, Object> info(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "hbt");
        map.put("age", "20");
        map.put("datatime", new SimpleDateFormat(format).format(new Date()));
        return map;
    }

    /**
     * 动态修改datetime指标
     * @param format
     */
    @WriteOperation
    public void setFormat(String format) {
        this.format = format;
    }
}
