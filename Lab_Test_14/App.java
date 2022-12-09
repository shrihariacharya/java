package com.jdbc.labTest14;

import java.util.Scanner;

import com.jdbc.labTest14.Dao.StudentDao;
import com.jdbc.labTest14.DaoImpl.StudentDaoImpl;
import com.jdbc.labTest14.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
    	displayStudent();
    }
       
    public static void displayStudent() {
		StudentDao sdao = new StudentDaoImpl();
		System.out.println("Press 1. To Insert Student :");
		System.out.println("Press 2. To View Student :");
		System.out.println("Press 3. To Update Student :");
		System.out.println("Press 4. To Delete Student :");
		System.out.println("Press 5. To Exit :");
		
		int id = 1;
		Student s;
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch (ch) {
		case 1:

			s =new Student();
			s.setSid(1);
			s.setSname("Shriram");
			s.setScontact("9404212531");
			sdao.insertStudent(s);
			System.out.println(id+" Record inserted.");
			break;
			
		case 2:
			s =new Student();
			s.setSid(1);
			s = sdao.getStudent(id);
			System.out.println(s);
			break;
			
		case 3:
			
			s =new Student();
			
			s = sdao.updateStudent(1,"Amol");
			break;
			
		case 4:
			System.out.println("Enter Id to be deleted");
			id = scan.nextInt();
			boolean st = sdao.deleteStudent(id);
			if (st == true) {
				System.out.println("Student deleted");
			} else {
				System.out.println("Student not deleted or it not exists");
			}

			break;
		case 5:
			System.out.println("Exited..");
			scan.close();
			System.exit(0);
			break;
		}

    }
}