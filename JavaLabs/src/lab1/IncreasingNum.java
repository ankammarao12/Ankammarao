package lab1;

import java.util.Scanner;

public class IncreasingNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number ");
		int number = sc.nextInt();

		if (check(number))

			System.out.println("The num is an increasing number");
		else {
			System.out.println("The num is not an increasing number");

		}
	}

	static boolean check(int number) {

		int lastNum = number % 10;
		number /= 10;
		boolean flag = false;

		while (number > 0) {

			if (lastNum <= number % 10) {
				flag = true;
				break;
			}
			lastNum = number % 10;
			number /= 10;
		}
		if (flag)

			return false;

		else {

			return true;
		}

	}

}
