package lab5;

import java.util.Scanner;

public class AgeExcpt {
	
	    public static void main(String[] args)
	    {
	          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
	 
	          System.out.println("Enter Your Age");
	 
	          int age = sc.nextInt();         //Taking input from user
	 
	          try
	          {
	              if(age > 15 )
	              {
	                 throw new AgeException();
	              }
	          }
	          catch(AgeException excep)
	          {
	              System.out.println(excep);     //Prints exception description
	          }
	    }
	}


