package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "User")
@Entity 
public class user {

	@Id 
	@Column(name = "uid")
	private int uid;

	@Column(name = "uname", length = 50, nullable = false)
	private String uname;

	@Column(name = "upassword")
	private int upassword;
	
	@Column(name = "ucity")
	private int city;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUpassword() {
		return upassword;
	}

	public void setUpassword(int upassword) {
		this.upassword = upassword;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	
}