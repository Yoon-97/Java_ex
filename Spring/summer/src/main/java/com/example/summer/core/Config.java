package com.example.summer.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public House getHouse() {
        return new House("B House");
    }
}
