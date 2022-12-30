package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity

public class Book {

	@Id	
	@Column(name="Book_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bId;
	
	@Column(name="Book_Name")
	private String bBookName;
	
	@Column(name="Book_Price")
	private int bPrice;
	
	@Column(name="Book_AuthorName")
	private String bAuthorName;
	
	@CreationTimestamp
    private LocalDateTime dateCreated;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Student> student;
	
		
}
