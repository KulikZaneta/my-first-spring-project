package com.codefirstgirl.myfirstspringproject.exercise1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final LocalDate localDate;

//    public ExampleService(LocalDate localDate) {
//        this.localDate = localDate;
//    }

    public void printDate() {
        System.out.println("The date is: " + localDate);
    }
}

