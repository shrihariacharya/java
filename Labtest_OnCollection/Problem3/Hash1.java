package Problem3;

import java.util.HashSet;

import Problem1.Student;

/*WAP to create a HassSet and add 5 student's id(101,102,103,104,105)  and name as value.
Print the name of students whose id is greater than 103.*/
public class Hash1 { //main class
	static HashSet<Student>hset;  
	
	public static void printhash()
	{
	 hset=new HashSet<>(); 
		Student s1=new Student(101,"john", "58966721358"); 
 		Student s2=new Student(102,"Devis", "88966721358"); 
 		Student s3=new Student(103,"Aryan", "7966721358");
		Student s4=new Student(104,"Kavin",  "88966721358"); 
		Student s5=new Student(105,"Splitsvem", "98966721358"); 
		
		hset.add(s1);
		hset.add(s2); 
		hset.add(s3); 
		hset.add(s5); 
		
		for(Student student : hset)
		{ 
			if (student.getId()>103)
			{ 
				System.out.println(student); 
			}
		}
			
	}
	
	public static void main(String[] args)
	{
		printhash(); 
	}
}