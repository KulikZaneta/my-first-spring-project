package com.codefirstgirl.myfirstspringproject.config;

import com.codefirstgirl.myfirstspringproject.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Car car() {
        return new Car("Red");
    }

}

