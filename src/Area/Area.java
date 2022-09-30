package Area;

public  class Area implements Shape {
 
	 
	public void rectangleArea() {
		int area=length*breadth ;
		 System.out.println("area of rectangle is:"+area);
	}


	public void squreArea() {
		int area=side*side;
		System.out.println("area of square is:" +area);
		
	}

	 
	public void circleArea() {
		double area=3.14*radius/2;
		System.out.println("area of circle is:"+area);
	}

}