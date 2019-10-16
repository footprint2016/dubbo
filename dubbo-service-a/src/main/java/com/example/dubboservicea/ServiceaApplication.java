package com.example.dubboservicea;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServiceaApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceaApplication.class, args);

        LOGGER.info("==============dubbo-service-a success to start===============");
    }

}
