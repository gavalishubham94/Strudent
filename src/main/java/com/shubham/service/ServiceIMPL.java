package com.shubham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shubham.model.Student;
import com.shubham.repository.StudentRepository;

@Service
public class ServiceIMPL implements ServiceI {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student saveStudent(Student student) {
		Student student1 = repository.save(student);
		System.out.println(student1);
		return student1;
	}


	@Override
	public List<Student> getAllStudents() {

		List<Student> list = repository.findAll();
		
		return list;
	}

	@Override
	public Student getStudentByAge(int Age) {
		
		Student students = repository.findBySage(Age);
		
		 return students;
	}

}
