package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain
{

	public static void main(String[] args)
	{
		
		ArrayList <Employee> emp=new ArrayList<>();
		
		Employee em1=new Employee("Abhi",23,"Development",34000);
		Employee em2=new Employee("Kishan",34,"Testing",10000);
		Employee em3=new Employee("Ram",33,"Managment",30000);
		Employee em4=new Employee("Sayyad",22,"Marketing",10000);
		Employee em5=new Employee("Shrihari",21,"Development",60000);
		Employee em6=new Employee("Omkar",25,"HR",80000);
	
	   emp.add(em1);
	   emp.add(em2);
	   emp.add(em3);
	   emp.add(em4);
	   emp.add(em5);
	   emp.add(em6);
	   
	 
	  //Solution of Problem 01.
	   
	Collections.sort(emp, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
       System.out.println("Printing employee names in sorted order\n" + emp);

       
     //Solution of Problem 02.
       
	System.out.println("\nEmployees whose salary is more than 10000 ....");
	
    List<Employee>li = emp.stream().filter(a -> a.getSalary()>10000).collect(Collectors.toList());
	int count = 0;
	for(Employee a:li) {
		count++;
		System.out.println(a);
	}
	
	System.out.println("\nNumber of Employees having salary more than 10000 is : "+count);
	
	
	//Solution of Problem 03.
	
    System.out.println("\nMaximum salary of employee is: "+emp.stream().max((e1,e2)-> e1.getSalary()>e2.getSalary()?1:-1).map(e1->e1.getName()+"- "+e1.getSalary()).get()); 
    }
}