package com.oauth20.example.configuration;

import com.oauth20.example.services.DogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public DogService getDogs(){
        return  new DogService();
    }
}
