import java.util.Scanner;

//Write a program to check whether a given string is palindrome or not.

public class Palindrome  
{    
    public static void main(String[] args) 
    {    
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter a string:");
    	 String str=sc.nextLine();
    	
    	
     
    	 boolean flag = true;    
            
        //Converts the given string into lowercase .   
        str = str.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for(int i = 0; i < str.length()/2; i++){    
            if(str.charAt(i) != str.charAt(str.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    
