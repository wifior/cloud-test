package com.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName IndexApplication
 * @Description TODO
 * @Author Think
 * @Date 2019/4/25 20:39
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class IndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndexApplication.class,args);
    }

}
