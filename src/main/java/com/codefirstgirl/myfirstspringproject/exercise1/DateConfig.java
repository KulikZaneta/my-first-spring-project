package com.codefirstgirl.myfirstspringproject.exercise1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DateConfig {

    @Bean
    public LocalDate localDate() {
        return LocalDate.of(2025, 12, 25);
    }

}

