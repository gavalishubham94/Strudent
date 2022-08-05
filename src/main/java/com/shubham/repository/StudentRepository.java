package com.shubham.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubham.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findBySage(Integer Age);
	
}
