package com.example.Spring_tutorial;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    String model;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void compile(){
        System.out.println("code is compiling on Laptop.....");
    }
}
