package deposited_bank;

public class BankC implements Bank{
	
	public int getvalue(int b)
	{
		System.out.println("Aamount deposited in BankC: "+b);
		return b;
	}

}