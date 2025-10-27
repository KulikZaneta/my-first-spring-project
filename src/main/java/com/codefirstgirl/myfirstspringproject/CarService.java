package com.codefirstgirl.myfirstspringproject;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
    private final Car car;

//    @Autowired
//    public CarService(Car car) {
//        this.car = car;
//    }

    public void printCarColor() {
        System.out.println("Car color: " + car.color());
    }

}

