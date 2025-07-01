package com.example.Spring_tutorial;

import com.example.Spring_tutorial.model.Computer;
import com.example.Spring_tutorial.model.Student;
import com.example.Spring_tutorial.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);

		Student student = (Student) context.getBean("student");
		student.setName("elon");
		student.setId(10);
		Computer computer = context.getBean(Computer.class);
		student.setComputer(computer);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(student);

	}

}
