package com.example.demo.Dto;

import java.util.Date;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.entities.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Studentdto {

	@Range(min=1,max=1000 , message="Student id must be between 10 to 1000")
	int sId;
	
	@NotBlank(message="Student Name couldn't be empty")
	@NotNull(message="Student Name couldn't be null")
	@Size(min=4,max=10,message="Student Name must be in between 4-10 chars")
	String sName;
	
    @NotNull(message="Student Contact couldn't be null")
    @Pattern(regexp = "\\d{10}$", message = " Invalid phone number ")
    @Size(max=10 , message="Student Contact size not less than 10")
    String sContact;
   
	@NotBlank(message="Department Name couldn't be empty")
	@NotNull(message="Department  Name  couldn't be null")
	@Size(max=12 ,message="Department Name not less than 12 ")
	String sDepartment;

	@NotEmpty(message = "Email is required!")
    @Email(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",
            flags = Pattern.Flag.CASE_INSENSITIVE,
            message = "Email must be a well-formed email address!")
     String sEmail;
	
	
	/*@DateTimeFormat(pattern="dd/mm/yyyy")
	@NotNull(message="Date/Time couldn't be null")
	Date datetime;
	*/
	
}
