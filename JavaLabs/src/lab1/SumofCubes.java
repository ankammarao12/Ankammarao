package lab1;

import java.util.*;

public class SumofCubes {
	public static void main(String args[]) {

		System.out.println("Enter a number");// input from user

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int sum = 0;

		while (number != 0) { // Logic for printing sum of cubes

			int digit = number % 10;
			sum = sum + digit * digit * digit;
			number = number / 10;
		}
		// the sum of cubes is
		
		System.out.println("The sum of cubes of digits of the given number is " + sum);

	}
}
