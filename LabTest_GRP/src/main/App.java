package EmployeeManagment.LabTest_grpProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import EmployeeManagment.LabTest_grpProject.Dao.EmployeeDao;
import EmployeeManagment.LabTest_grpProject.Entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {	
    	
    	System.out.println("Hello World!");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml.xml");
		
		
		EmployeeDao ddao = (EmployeeDao) ac.getBean("empdao");
		Employee emp1 = new Employee(1, "Shrihari","1234567890");
		Employee emp2 = new Employee(2, "Ashish","2134567890");
		Employee emp3 = new Employee(3, "Prachi","3214567890");
		
		

		ddao.insertEmployee(emp1);
		ddao.insertEmployee(emp2);
		ddao.insertEmployee(emp3);

		List<Employee> elist = ddao.getAllEmployee();

		System.out.println(elist);
		

		

	}
}
