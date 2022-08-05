package com.shubham.service;

import java.util.List;

import com.shubham.model.Student;


public interface ServiceI {

	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentByAge(int Age);
}
