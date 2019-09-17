package com.example.dubboservice.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Function description
 *
 * @Author: Vampire-潘伟
 * @Data: 2019/9/10 20:02
 */
@Configuration
@MapperScan("com.example.dubboservice.dao")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
