package com.example.Spring_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("14")
    private int id;
    private String name;

//    private Laptop laptop;
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }
    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
    @Override
    public String toString() {
        return "Student {" +
                "id =" + id +
                ", name ='" + name + '\'' +
                '}';
    }

    void code(){
        System.out.println("Student is writing code");
        computer.compile();
    }
}
