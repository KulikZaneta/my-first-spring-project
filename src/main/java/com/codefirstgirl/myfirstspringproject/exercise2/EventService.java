package com.codefirstgirl.myfirstspringproject.exercise2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final SpecificEvent specificEvent;

//    public EventService(SpecificEvent specificEvent) {
//        this.specificEvent = specificEvent;
//    }

    public void printEventDetails() {
        System.out.println("Event: " + specificEvent.getEventName()
                + " on " + specificEvent.getSpecificDate());
    }
}

