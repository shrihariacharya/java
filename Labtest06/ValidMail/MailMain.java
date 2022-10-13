package ValidMail;

public class MailMain
{

	public static void main(String[] args)
	{
		EmailId ml= new EmailId();
		try
		{
			ml.setEmail("acharyashrihari21@gmailcom");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Mail ID : "+ml.getEmail());
		

	}

}
