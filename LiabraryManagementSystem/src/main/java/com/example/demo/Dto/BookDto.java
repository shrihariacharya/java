 package com.example.demo.Dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder 
public class BookDto {

	@Range(min=1,max=1000 , message="Book id must be between 10 to 1000")
	int bId;
	
	@NotBlank(message=" Book name can't be empty")
    @NotNull(message="Book Name can't be null")
	
	String bBookName;
	
	@NotBlank(message="Author name can't be empty")
	@NotNull(message="Author name can't be null")
	
	String bAuthorName;
	
	@Range(min=10,max=1000 , message="Book price must be in between 10 to 10000")
	int bPrice;

}
