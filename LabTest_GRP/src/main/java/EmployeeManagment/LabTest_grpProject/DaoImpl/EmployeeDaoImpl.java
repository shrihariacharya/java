package EmployeeManagment.LabTest.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import EmployeeManagment.LabTest.Dao.EmployeeDao;
import EmployeeManagment.LabTest.Entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateTemplate ht;

	// To insert record of department
	@Transactional
	public int insertEmployee(Employee emp) {
		int id = (int) ht.save(emp);
		return 1;

	}

	// To update record of department
	@Transactional
	public int updateEmployee(Employee emp) {
		ht.update(emp);
		return 1;

	}

	// To delete record of department
	@Transactional
	public int deleteEmployee(Employee emp) {
		ht.delete(emp);
		return 1;

	}

	// To get specific record
	public Employee  getEmployee(int id) {
		Employee emp = ht.get(Employee.class, id);
		return emp;

	}

	// To get all records
	public List<Employee> getAllEmployee() {

		List<Employee> empList = ht.loadAll(Employee.class);
		return empList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}