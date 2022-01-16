package com.example.micro.ministry_of_interior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MinistryOfInteriorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinistryOfInteriorApplication.class, args);
    }

}
