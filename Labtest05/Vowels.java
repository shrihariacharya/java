//Write a program to count the total number of vowels and consonants present in the given string.


import java.util.*;
 
// Main class
class Vowels {
   
     //starting main method.
    public static void main(String[]args)
    {	//Taking input from user.
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
   
        // Declaring and  initializing elements.
        int vow = 0, con = 0;
     
       // Declaring a reference String which contains all the vowels
        String ref = "aeiouAEIOU";
       
        for (int i = 0; i < str.length(); i++) {
             
       // Check for any special characters present in the given string
            if ((str.charAt(i) >= 'A'
                 && str.charAt(i) <= 'S')
                || (str.charAt(i) >= 'a'
                    && str.charAt(i) <= 's')) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
                else
                    con++;
            }
        }
       
        // Print and display number of vowels and consonants
        System.out.println("Number of Vowels = " + vow
         + "\nNumber of Consonants = " + con);
    }
}