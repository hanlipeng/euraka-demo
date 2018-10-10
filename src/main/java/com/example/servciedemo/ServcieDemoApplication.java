package com.example.servciedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServcieDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServcieDemoApplication.class, args);
    }
}
