package EmployeeManagment.LabTest_grpProject.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import EmployeeManagment.LabTest_grpProject.Dao.EmployeeDao;
import EmployeeManagment.LabTest_grpProject.Entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private HibernateTemplate ht;

	// To insert record of department
	@Transactional
	public int insertEmployee(Employee st) {
		int id = (int) ht.save(st);
		return 1;

	}

	// To update record of department
	@Transactional
	public int updateEmployee(Employee st) {
		ht.update(st);
		return 1;

	}

	// To delete record of department
	@Transactional
	public int deleteEmployee(Employee s) {
		ht.delete(s);
		return 1;

	}

	

	// To get all records
	public List<Employee> getAllEmployee() {

		List<Employee> deptList = ht.loadAll(Employee.class);
		return deptList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	//@Override
	public Employee getEmployee(int id) {
		Employee dept = ht.get(Employee.class, id);
		return dept;

	}


}
