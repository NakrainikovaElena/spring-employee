package com.nalmtal.Spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private final Car car;
    private final Pet pet;
    private final String name;
    private final int age;

    public Employee(Car car,
                    Pet pet,
                    @Value("${employee.name}") String name,
                    @Value("${employee.age}") int age) {
        this.car = car;
        this.pet = pet;
        this.name = name;
        this.age = age;

        System.out.println("Employee: object create");
    }

    public Car getCar() {
        return car;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @PostConstruct
    public void init() {
        System.out.println("Employee: init method.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Employee: destroy method.");
    }

    public String introduce() {
        return "I am " + name + ", " + age + " years old, driving: "+ car.getModel()
                + ", with pet: " + pet.getName() + " (" + pet.getType() + ").";
    }
}
