package packg1;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;
		// System.out.println(x[2]);

		for (int num : x) {
			System.out.println(num);
		}
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {

				System.out.println(x[i]);
			}
		}

	}

}
