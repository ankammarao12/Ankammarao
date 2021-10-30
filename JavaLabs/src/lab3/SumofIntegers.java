package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumofIntegers {
	
	  public static void main(String args[]) {
	        int n;
	        int sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter integers :");
	        String s = sc.nextLine();
	        StringTokenizer s1 = new StringTokenizer(s, " ");
	        while (s1.hasMoreTokens()) {
	            String temp = s1.nextToken();
	            n = Integer.parseInt(temp);
	            System.out.println(n);
	            sum = sum + n;
	        }
	        System.out.println("sum of  integers is: " + sum);
	       
	    }

}
