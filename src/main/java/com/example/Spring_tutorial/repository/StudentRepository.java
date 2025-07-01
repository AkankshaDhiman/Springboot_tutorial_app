package com.example.Spring_tutorial.repository;

import com.example.Spring_tutorial.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save(Student student) {
        System.out.println("student is saved");
    }
}
