package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.Studentdto;
import com.example.demo.entities.Student;
import com.example.demo.exception.UserNotFoundexception;
import com.example.demo.service.StudentServicee;

@RestController
public class Studentcontroller {

	@Autowired(required=true)
	StudentServicee ss;
	
	@PostMapping("/student")
	public  ResponseEntity<Student> createStudent(@RequestBody @Valid Studentdto st)
	{	  	
		 Student s=ss.createStudent(st);
		if(s!=null)
			return new ResponseEntity<Student>(s, HttpStatus.CREATED);
		
	   return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id)
	{
		try {
		Student s=ss.getStudent(id);
		if(s!=null)
			return new ResponseEntity<Student>(s, HttpStatus.OK);
		}catch(Exception e)
		{		
	       throw new UserNotFoundexception("user not found");
		}
		 return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents()
	{
		try {
			List<Student> slist=ss.getAllStudents();
			if(slist!=null)
				return new ResponseEntity<List<Student>>(slist, HttpStatus.OK);
			}catch(Exception e)
			{		
		       e.printStackTrace();
			}
			 return new ResponseEntity<List<Student>>(HttpStatus.NOT_FOUND);
		
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<String> updatestudent(@PathVariable int id,@RequestBody Studentdto st)
	{
		try
		{
			String s=ss.updateStudent(id, st);
			if(s!=null)
				return new ResponseEntity<String>(s,HttpStatus.CREATED);
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity <String>deletestudent(@PathVariable int id)
	{
		try
		{
		String s=ss.deleteStudent(id);
		if(s!=null)
			return new ResponseEntity<String>(s,HttpStatus.OK);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	
}
