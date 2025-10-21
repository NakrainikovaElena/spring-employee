package com.nalmtal.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    private final Employee employee;

    public HelloWorld(Employee employee) {
        this.employee = employee;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        if (name == null || name.isBlank()) {
            return "Hello, world";
        }
        return "Hello, " + name;
    }

    @GetMapping("/employee")
    public String showEmployee() {
        return employee.introduce();
    }
}

