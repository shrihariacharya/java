package countvowels;

public class Count
{
	public int countVowels(String vowels)  throws InvalidCharException
	{
	String vow  = vowels.toLowerCase();
	int count = 0;
	for(int i=0;i<(vow.length());i++) 
	{
		if(vow.charAt(i)=='a'||vow.charAt(i)=='e'||vow.charAt(i)=='i'||vow.charAt(i)=='o'||vow.charAt(i)=='u')
		{
			count++;
		}	
	}
	char[] ch=new char[count];
	int c =0;
	for(int i=0;i<(vow.length());i++)
	{
		if (vow.charAt(i)=='x')
		{
		 throw new InvalidCharException("Invalid char x present.");
		}
		
		if(vow.charAt(i)=='a'||vow.charAt(i)=='e'||vow.charAt(i)=='i'||vow.charAt(i)=='o'||vow.charAt(i)=='u')
		{
			
			ch[c]=vow.charAt(i);
			c++;
		}	
	}
	return count;	
	}
}