public class primeNumber {
	
	
	void prime(){
	{
			int i,count, n=20;
	        System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2;j<=n;j++)
	  {
		count=0;
		for(i=1;i<=j;i++)
	  {
			if(j%i==0)
			{
				count++;        
			}
	  }
	if(count==2)
	    System.out.print(j+"  ");     
	  }
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeNumber sm=new primeNumber();
		sm.prime();
		
  }
}