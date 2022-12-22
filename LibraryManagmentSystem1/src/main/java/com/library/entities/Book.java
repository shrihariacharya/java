package com.library.entities;

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

public class Book {
	@Id
	@GeneratedValue
	int bId;
	String bName;
	int bPrice;
	String bAuthorName;
	public Book(int bId, String bName, int bPrice, String bAuthorName) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
		this.bAuthorName = bAuthorName;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getbPrice() {
		return bPrice;
	}
	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}
	public String getbAuthorName() {
		return bAuthorName;
	}
	public void setbAuthorName(String bAuthorName) {
		this.bAuthorName = bAuthorName;
	}
	

}
