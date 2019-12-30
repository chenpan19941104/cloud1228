package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cp
 * @create 2019-12-29 16:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp81 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp81.class, args);
    }
}
