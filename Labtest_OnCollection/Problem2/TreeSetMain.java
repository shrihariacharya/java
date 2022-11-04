package Problem2;

/*Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
Get the number of elements in  tree set and print first and last element of treeset.*/
import java.util.TreeSet;
import java.util.ArrayList;
/*import Problem1.Student;
import Problem1.StudentMain;*/
import Problem1.*;

public class TreeSetMain 
{
	
 public static void main(String[] args) 
	{ 
		
	TreeSet<Student> tset=new TreeSet<>();
	
	Student.fillset(); 
	tset.addAll(StudentMain.st);  
	tset.addAll(StudentMain.st); 
	
	System.out.println("Number of elements:"+tset.size()); 
	System.out.println("adds elements in first:"+tset.pollFirst()); 
	System.out.println("adds elements in last:"+tset.pollLast()); 
	
	}

}
