package com.example.micro.ministry_of_finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MinistryOfFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinistryOfFinanceApplication.class, args);
    }

}
