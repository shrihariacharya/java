package deposited_bank;

public class BankB implements Bank {
	
	public int getvalue (int b)
	{
		System.out.println("Aamount deposited in BankB: "+b);
		return b;
	}

}
