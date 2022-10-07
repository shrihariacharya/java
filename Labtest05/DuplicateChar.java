import java.util.Scanner;

public class DuplicateChar {  
     public static void main(String[] args) {  
       
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter a string:");
    	 String str=sc.nextLine();
        int count;  
          
      //Converts given string into character array  
        char string[] = str.toCharArray();  
        System.out.println("Given string is not a palindrome:");
        
      //Counts each character present in the string  
        for(int i = 0; i <string.length; i++)
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
            {  
                if(string[i] == string[j] && string[i] != ' ')
                {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);
        }
    }
}