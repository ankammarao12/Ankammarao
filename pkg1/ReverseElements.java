package pkg1;

public class ReverseElements {

	public static void main(String args[]) {

		int[] x = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		System.out.println(" Array printed in reverse order:");
		for (int i = x.length - 1; i >= 0; i--)
			System.out.print(x[i] + "  ");
	}

}

