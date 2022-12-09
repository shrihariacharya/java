package com.jdbc.labTest14.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Student_details")
public class Student {
	
	@Id // id annotation to set primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sid")
	private int Sid;
	
	@Column(name = "Sname", length = 50, nullable = false)
	private String Sname;

	@Column(name = "Scontact",length = 10, nullable = false, unique = true)
	private String Scontact;

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getScontact() {
		return Scontact;
	}

	public void setScontact(String scontact) {
		Scontact = scontact;
	}

}
