package lab1;

import java.util.Scanner;

public class PrimeNums {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Enter range from user 
		
		System.out.println("Enter range for prime number: ");
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are: ");

		for (int i = 1; i <= n; i++) {  // for loop executing
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.print(i + " ");
			}

		}
	}

	static void primeNum(int n) {

	}
}
