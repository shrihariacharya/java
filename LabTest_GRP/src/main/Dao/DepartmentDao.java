package EmployeeManagment.LabTest_grpProject.Dao;

import java.util.List;

import EmployeeManagment.LabTest_grpProject.Entities.Department;

public interface DepartmentDao {

	public int insertDepartment(Department dpt);

	public int updateDepartment(Department dpt);

	public int deleteDepartment(Department dpt);
	
	public Department getDepartment(Department dpt);

	public List<Department> getAllDepartment(Department dpt);

}
