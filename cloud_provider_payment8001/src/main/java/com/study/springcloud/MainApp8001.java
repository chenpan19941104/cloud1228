package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cp
 * @create 2019-12-29 15:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8001.class,args);
    }
}
