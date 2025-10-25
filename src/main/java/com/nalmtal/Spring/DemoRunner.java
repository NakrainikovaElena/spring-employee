package com.nalmtal.Spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final Car car;
    private final Pet pet;
    private final Employee employee;

    public DemoRunner(Car car, Pet pet, Employee employee) {
        this.car = car;
        this.pet = pet;
        this.employee = employee;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- BEFORE SETTERS ---");
        System.out.println(employee.introduce());

        System.out.println("\n--- USING SETTERS ---");
        car.setModel("Sports car");
        pet.setName("Bella");
        pet.setType("cat");

        System.out.println("\n--- AFTER SETTERS ---");
        System.out.println(employee.introduce());
        System.out.println("Pet speaks: " + pet.speak());
        System.out.println("Car drive: " + car.drive());
    }
}