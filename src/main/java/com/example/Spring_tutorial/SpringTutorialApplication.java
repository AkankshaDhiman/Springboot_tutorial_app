package com.example.Spring_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);

		Student student = (Student) context.getBean("student");
		//student.setId(12);
		student.setName("elon");
//		System.out.println(student.toString());
		student.code();
	}

}
