package employee;

public class ManagerMain {
public static void main(String[] args)
{ 
	

	Manager m1=new Manager("Rishi",40,"9860872531","Sambhjinagar",60000,"Computer Science");
	System.out.println("\nInformation about Manager:");
	m1.displayinfo(); 


	Employee1 emp1=new Employee1("Shrihari",22,"7028497409","Sambhajinagar",40000,"Computer Science");
	System.out.println("\n\nInformation about Employee:");
	emp1.Printinfo(); 
}
}