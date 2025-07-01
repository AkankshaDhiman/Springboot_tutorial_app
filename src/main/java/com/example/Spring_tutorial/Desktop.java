package com.example.Spring_tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
//    String brand;
//
//    public String getBrand() {
//        return brand;
//    }
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    @Override
    public void compile() {
        System.out.println("code is compiling on desktop.....");
    }
}

