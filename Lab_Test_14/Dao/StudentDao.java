package com.jdbc.labTest14.Dao;

import com.jdbc.labTest14.entities.Student;

public interface StudentDao {
	
	public Student insertStudent(Student st); 
	public Student getStudent(int id);
	public boolean deleteStudent(int id);
	public Student updateStudent(int id, String nm); 

}