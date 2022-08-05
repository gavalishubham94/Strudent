package com.shubham.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.model.Student;
import com.shubham.service.ServiceI;

@RestController
public class StudentController {

	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value="/saveStudent", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> saveStudent( @RequestBody Student student) {
		System.out.println(student);
		
		Student student1 = serviceI.saveStudent(student);
	
		String responce="Congratulations "+student1.getStudentName()+ "; your details has been saved and your Id is "+ student1.getStudentId();
		return new ResponseEntity<String> (responce,HttpStatus.OK);

	}
	
	
	 @GetMapping(value = "/getAllStudents" ,  produces = "application/json") 
	 public ResponseEntity<List<Student>> getAllStudents(){
	
	      List<Student> students = serviceI.getAllStudents();
	      
	  return   (new ResponseEntity<List<Student>> (students,HttpStatus.OK));
	 
	  }
	

	 @GetMapping(value = "/getStudentsbyage/{sage}" , produces = "application/json" ) 
	public ResponseEntity<Student> getStudentByAge(@PathVariable  int sage) {
	 //@GetMapping(value = "/getStudentsbyage" , consumes = "application/json", produces = "application/json" ) 
		// public ResponseEntity<Student> getStudentByAge(@RequestBody  int sage) {
		Student list = serviceI.getStudentByAge(sage);
		
		return new ResponseEntity<Student> (list,HttpStatus.OK);

	}

}


