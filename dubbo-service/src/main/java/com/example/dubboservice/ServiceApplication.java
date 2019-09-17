package com.example.dubboservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);

        LOGGER.info("==============dubbo-service success to start===============");
    }

}
