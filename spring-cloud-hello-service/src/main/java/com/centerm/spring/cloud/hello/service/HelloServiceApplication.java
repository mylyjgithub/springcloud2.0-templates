package com.centerm.spring.cloud.hello.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by luyijian on 2019/9/26.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class,args);
    }
}
