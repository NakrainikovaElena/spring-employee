package com.nalmtal.Spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    private String name = "Rock";
    private String type = "dog";

    public Pet() {
        System.out.println("Pet: object create");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Pet: setName called with value: " + name);
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("Pet: setType called with value: " + type);
        this.type = type;
    }

    public String speak() {
        return ("dog".equalsIgnoreCase(type) ? "Woof!" : "Meow!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Pet: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pet: destroy method");
    }
}
