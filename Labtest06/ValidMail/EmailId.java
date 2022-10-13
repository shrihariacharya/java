package ValidMail;

public class EmailId 
	{
	private String MailID;

	public String getEmail() 
	{
		return MailID;
	}

	public void setEmail(String mail) throws Exception
	{
		if (mail.contains("@")&&mail.contains(".")) 
		{
			this.MailID = mail;
		}
		else 
		{
			throw new Exception("This Mail ID is invalid.");
		}
		
	}

}
