package com.codefirstgirl.myfirstspringproject.exercise2;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Component
public class SpecificEvent {

    private final LocalDate specificDate;
    private final String eventName;


    public SpecificEvent() {
        this.specificDate = LocalDate.of(2025, 12, 25);
        this.eventName = "Christmas Party";
    }

    @Override
    public String toString() {
        return "SpecificEvent{" +
                "specificDate=" + specificDate +
                ", eventName='" + eventName + '\'' +
                '}';
    }

}

