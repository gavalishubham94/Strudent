package com.shubham.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID")
	private Integer StudentId;
	@Column(name = "STUDENT_NAME")
	private String StudentName;
	@Column(name = "STUDENT_EMAIL")
	private String StudentEmail;
	
	private Integer sage;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public int getStudentAge() {
		return sage;
	}
	public void setStudentAge(int studentAge) {
		sage = studentAge;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ ", StudentAge=" + sage + "]";
	}
	
	
	
}
