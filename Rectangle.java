public class Rectangle {
		
		int length;
		int width;
		
	Rectangle()    //Default constructor.
		{
			length=0;
			width=0;
		}
		
	Rectangle(int length, int width) //Parameterized Constructor.
		{
			this.length=length;
			this.width=width;
		}

	void area()              //Method for calculating the are.
		{
			int area;
			area= length*width;
			System.out.println(area);
		}
				
	public static void main(String[] args) {
			
		//Creating instance.
			
		Rectangle  r1=new Rectangle();
		System.out.println("Area of first Rectangle= ");
		r1.length=2;
		r1.width=6;
		r1.area();
			
		
		Rectangle  r2=new Rectangle(4,6);    //Calling constructor.
		System.out.println("Area of second Rectangle= ");
		r2.area();
	}
}