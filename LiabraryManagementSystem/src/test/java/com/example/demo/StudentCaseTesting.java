package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Student;
import com.example.demo.repositories.Studentrepositori;

public class StudentCaseTesting {

	@Autowired
	private Studentrepositori srepo;
	
	@Test
	@DisplayName("it should return list of studnets")
	 void getallstudents()
	 {
		Student st=new Student();
		st.setSId(1);
		st.setSName("Anagha");
		st.setSDepartment("Technician");
		st.setSContact("9877655433");
		st.setSEmail("ana234@gmail.com");
		srepo.save(st);
		
		Student st1=new Student();
		st1.setSId(1);
		st1.setSName("Samagha");
		st1.setSDepartment("Developer");
		st1.setSContact("8877655433");
		st1.setSEmail("sam234@gmail.com");
		srepo.save(st1);
		
		List<Student>slist=srepo.findAll();
		assertNotNull(slist);
		assertThat(slist).isNotNull();
	 }
	
	@Test
	@DisplayName("it should update student name and return as Mahi")
	void updatestudentname()
	{
		Student st1=new Student();
		st1.setSId(1);
		st1.setSName("Samagha");
		st1.setSDepartment("Developer");
		st1.setSContact("8877655433");
		st1.setSEmail("sam234@gmail.com");
		srepo.save(st1);
		
		Student s1=srepo.findById(st1.getSId()).get();
		s1.setSName("Mahi");
		Student updatedstudent=srepo.save(s1);
		
		assertEquals("Mahi",updatedstudent.getSName());
		assertEquals("Developer",updatedstudent.getSDepartment());
	}
	
	@Test
	@DisplayName("")
    void getstudnetbyid()
	{
		Student st=new Student();
		st.setSId(1);
		st.setSName("Anagha");
		st.setSDepartment("Technician");
		st.setSContact("9877655433");
		st.setSEmail("ana234@gmail.com");
		srepo.save(st);
	
		
		Student newstudent=srepo.findById(st.getSId()).get();
		
		assertNotNull(newstudent);
		assertEquals("Anagha",newstudent.getSName());
	
	
	}

}
