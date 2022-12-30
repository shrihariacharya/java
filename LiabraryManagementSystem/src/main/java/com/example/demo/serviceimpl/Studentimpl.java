package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.Studentdto;
import com.example.demo.entities.Student;
import com.example.demo.repositories.Studentrepositori;
import com.example.demo.service.StudentServicee;

@Service
public class Studentimpl implements StudentServicee {

	@Autowired
	Studentrepositori sr;
	
	@Override
	public Student createStudent(Studentdto st1) {
	  Student st=Student.builder()
			 // .sId(st1.getSId())
			  .sName(st1.getSName())
			  .sContact(st1.getSContact())
			  .sDepartment(st1.getSDepartment())
			  .sEmail(st1.getSEmail()).build();
		return sr.save(st);
	}

	@Override
	public Student getStudent(int id) {
	
		return sr.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
	
		return sr.findAll();
	}

	@Override
	public String deleteStudent(int id) {
		sr.deleteById(id);
		return "Record successfully deleted..";
	}

	@Override
	public String updateStudent(int id, Studentdto st) {
		Student s=sr.findById(id).get();
		
		Student ss=Student.builder()
				.sId(id)
				.sName(st.getSName())
				.sContact(st.getSContact())
				.sDepartment(st.getSDepartment())
				.sEmail(st.getSEmail())
				.build();
		       sr.save(ss);
		    return "Record successfully updated...";
	}

	@Override
	public Student updateStudentName(int id, String name) {
		Student s1=sr.findById(id).get();
		s1.setSName(name);
		return sr.save(s1);
	}

	@Override
	public String deleteAllStudents() {
	    sr.deleteAll();
		return "Records deleted successfully...";
	}

}
