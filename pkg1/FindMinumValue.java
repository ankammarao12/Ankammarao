package pkg1;

public class FindMinumValue {

	public static void main(String[] args) {

		int[] m = new int[] { 24, 100, 73, 76, 5 };

		System.out.println("Array is");

		for (int i = 0; i < m.length; i++) {

			System.out.println(m[i]);
		}

		// Initialize minValue with first element of array.
		int minValue = m[0];

		// Loop through the array
		for (int i = 0; i < m.length; i++) {

			// Compare elements of array with minValue and
			// if condition true, make minValue to that
			// element

			if (m[i] < minValue)

				minValue = m[i];
		}

		System.out.println("Minimum element present in given array: " + minValue);
	}
}

