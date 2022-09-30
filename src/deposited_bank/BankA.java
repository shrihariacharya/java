package deposited_bank;

public class BankA implements Bank {
	
	public int getvalue(int b)
	{
		System.out.println("Aamount deposited in BankA: "+b);
		return b;
	}

}
