package com.example.demo.service;

import java.util.List;


import org.springframework.stereotype.Component;

import com.example.demo.Dto.Studentdto;
import com.example.demo.entities.Student;

@Component
public interface StudentServicee {

	public Student createStudent(Studentdto st);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
	public String deleteStudent(int id);
	public String updateStudent(int id,Studentdto st);
	public Student updateStudentName(int id, String name);
	public String deleteAllStudents();

	
	 

}
