package lab2;

// program for removing duplicate elements from array

import java.util.Scanner;

public class RemoveDuplicate {

	public static int size;

	public static int duplicates(int[] a) {
		if (a.length <= 1)
			return a.length;
		int[] temp = new int[a.length];
		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[a.length - 1];

		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}
		return j;
	}

	public static int[] modifyArray(int[] a) {

		for (int i = 0; i < a.length - 1; i++)
			for (int j = 0; j < a.length - i - 1; j++)
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		size = duplicates(a);
		int[] r = new int[size];
		for (int i = 0; i < size; i++)
			r[i] = a[i];
		return r;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// giving input from user
		
		System.out.println("Enter size of Array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements in an array");
		int i, j;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		modifyArray(a);
		System.out.println("Array after removing Duplicate Elements");
		for (i = 0; i < size; i++)
			System.out.print(a[i] + " ");
	}

}
