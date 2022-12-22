package com.library.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	int sId;
	String sName;
	String sFaculty;
	int sContact;
	String sEmail;
	public Student(int sId, String sName, String sFaculty, int sContact, String sEmail) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sFaculty = sFaculty;
		this.sContact = sContact;
		this.sEmail = sEmail;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsFaculty() {
		return sFaculty;
	}
	public void setsFaculty(String sFaculty) {
		this.sFaculty = sFaculty;
	}
	public int getsContact() {
		return sContact;
	}
	public void setsContact(int sContact) {
		this.sContact = sContact;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	

}

