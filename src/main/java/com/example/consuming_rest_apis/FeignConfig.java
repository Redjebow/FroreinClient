package com.example.consuming_rest_apis;

import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public FeignContext feignContext() {
        return new FeignContext();
    }
}
