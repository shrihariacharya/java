package deposited_bank;

public class BankMain {

	public static void main(String[] args) {
	Bank b1=new BankA();
	Bank b2=new BankB();
	Bank b3=new BankC();
	
	b1.getvalue(1000);
	b2.getvalue(1500);
	b3.getvalue(2000);

	
	}
}