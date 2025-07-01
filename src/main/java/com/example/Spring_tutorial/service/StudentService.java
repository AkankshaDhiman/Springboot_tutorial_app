package com.example.Spring_tutorial.service;
import com.example.Spring_tutorial.model.Student;
import com.example.Spring_tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository stRepository;

    public StudentRepository getStRepository() {
        return stRepository;
    }
    @Autowired
    public void setStRepository(StudentRepository stRepository) {
        this.stRepository = stRepository;
    }

    public void addStudent(Student s) {
        System.out.println("new student added" );
        stRepository.save(s);
    }
}
