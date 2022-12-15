package EmployeeManagment.LabTest_grpProject.Dao;

import java.util.List;

import EmployeeManagment.LabTest_grpProject.Entities.Employee;

public interface EmployeeDao {
	
	public int insertEmployee(Employee emp);

	public int updateEmployee(Employee emp);

	public int deleteEmployee(Employee emp);
	
	public Employee  getEmployee(int id);

	public List<Employee> getAllEmployee();

}
