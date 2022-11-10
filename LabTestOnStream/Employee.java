package problems;

public class Employee
{
	
	//data members of employee class
	private String name;
	private int age;
	private String dept;
	private int salary;

	//generate default constructor
	public Employee() 
	{  
		super();
	}
	
	 //generate Parameterized constructor
	public Employee(String name, int age, String dept, int salary) 
	{
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	//genertate getters and setters
	public String getName() 
	{  
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	//generate tostring 
	@Override
	public String toString() 
	{
		return "Name=" + name + ", Age=" + age + ", Dept=" + dept + ", Salary=" + salary +";";
	}
	
	
}
