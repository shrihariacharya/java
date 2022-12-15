package EmployeeManagment.LabTest_grpProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import EmployeeManagment.LabTest_grpProject.Dao.EmployeeDao;
import EmployeeManagment.LabTest_grpProject.Entities.Employee;

public class EmployeeTest {
static EmployeeDao empdao;
	
	@BeforeAll
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		empdao = (EmployeeDao) ac.getBean("empdao");
	}
	
	@Test
	public void testGetEmployee() {
		//positive case
		Employee dt = empdao.getEmployee(4);
		assertEquals(4, dt.getEid());
	}
	
	@Test
	public void testUpdateEmployee() {
		//negative case
		Employee dt = empdao.getEmployee(1);
		dt.setEname("Kishan");
		assertEquals(1, empdao.updateEmployee(dt));
	}


}
