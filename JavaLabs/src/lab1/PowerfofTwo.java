package lab1;

import java.util.Scanner;

public class PowerfofTwo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		if (Number(n))
			
			System.out.println(n + " is a power of Two");
		
		else {
			
			System.out.println(n + " is not a power of Two.");
			
		}
	}

	static boolean Number(int n) {
		
		if (n == 0)
			
			return false;
		
		while (n != 1) {
			
			if (n % 2 != 0)
				
				return false;
			
			n = n / 2;
		}
		
		return true;
	}

}
