package com.example.dubboserviceb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ServicebApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServicebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServicebApplication.class, args);

        LOGGER.info("==============dubbo-service-b success to start===============");
    }

}
