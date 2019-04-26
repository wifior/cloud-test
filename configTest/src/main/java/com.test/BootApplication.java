package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BootApplication
 * @Description TODO
 * @Author Think
 * @Date 2019/4/26 21:19
 * @Version 1.0
 **/
@SpringBootApplication
@RestController
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }

    @Value("${spring.application.name}")
    String name;

    @RequestMapping("/hi")
    public String hi(){
        return name;
    }
}
