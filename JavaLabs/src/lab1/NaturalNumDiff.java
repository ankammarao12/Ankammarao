package lab1;

import java.util.Scanner;

public class NaturalNumDiff {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = sc.nextInt();

		System.out.println("Difference between sum of square and square of sum is: " + Difference(n));

	}

	static int Difference(int n) {

		int s1 = 0;
		int s2 = 0;
		int diff = 0;

		for (int i = 0; i <= n; i++) {
			s1 += (i * i);
			s2 += i;
		}

		int sqSum = (s2 * s2);
		diff = sqSum - s1;
		return diff;

	}

}
