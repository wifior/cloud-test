package com.cloudTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author Think
 * @Date 2019/4/29 18:02
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello"+name+" ,你已进入zuul";
    }
}
