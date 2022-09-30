package deposited_bank;

public interface  Bank {
	
	public default int  getvalue(int b)
	{
		return b;
	}
}