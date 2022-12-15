package EmployeeManagment.LabTest_grpProject.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String econtact;
	
	public Employee(int eid, String ename, String econtact) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.econtact = econtact;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcontact() {
		return econtact;
	}

	public void setEcontact(String econtact) {
		this.econtact = econtact;
	}

}