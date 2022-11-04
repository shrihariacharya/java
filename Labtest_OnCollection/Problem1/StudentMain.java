package Problem1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentMain 
{ 
  public static Collection<? extends Student> st;


public static void fillset() 
	{
	 
	ArrayList <Student> st=new ArrayList<>(); 
    Student st1=new Student(111,"Shrihari",  "7028497409"); 
    Student st2=new Student(112,"Amol",  "1234567890"); 
    Student st3=new Student(113,"Dipak", "0987654321"); 
	    
    st.add(st1);
    st.add(st2); 
    st.add(st3);
	    
      ArrayList <Student> str=new ArrayList<>();
	  Student str1=new Student(101,"Ram", "7986594236");
	  Student str2=new Student(102,"Sayyad", "786594236"); 
      Student str3=new Student(103,"Shrikant", "8886594236");
	   
	    str.add(str1); 
	    str.add(str2); 
	    str.add(str3); 
	    
	    st.addAll(str); 
	
	    Iterator<Student>itr= st.iterator(); 
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next()); 
		}
	
		Collections.sort(st, new Idcomparator()); 
		
		System.out.println("\nAfter sorting Student id........ ");
		itr=st.iterator();
		   
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		}
	   

	public static void main(String[] args) 
	{
		fillset(); 
	}
}