package com.shubham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shubham.model.Student;

@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentDetailsApplication.class, args);
		
	}

}
