package EmployeeManagment.LabTest_grpProject.Entities;

import java.util.List;

public class Department {
	
	private int did;
	private String dname;
	List<Department> dlist;
	
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
		this.dlist = dlist;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Department> getDlist() {
		return dlist;
	}

	public void setDlist(List<Department> dlist) {
		this.dlist = dlist;
	}
	

}
