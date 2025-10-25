package com.nalmtal.Spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "Passenger car";

    public Car() {
        System.out.println("Car: object created.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Car: setModel called with value: " + model);
        this.model = model;
    }

    @PostConstruct
    public void init() {
        System.out.println("Car: init method.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car: destroy method.");
    }

    public String drive() {
        return "Driving a " + model;
    }
}