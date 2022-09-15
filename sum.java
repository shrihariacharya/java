
public class sum {
	
	
	 void sum()
	{
	int n, sm=0;
        
        for(n= 1; n<= 100; n++)
        {
          sm=sm+n;
        }
        System.out.println(sm);

	}

	public static void main(String[] args)
	{
		sum total=new sum();
		total.sum();
	}

}