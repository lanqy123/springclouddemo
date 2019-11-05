package com.example.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringclouddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoApplication.class, args);
    }

}
