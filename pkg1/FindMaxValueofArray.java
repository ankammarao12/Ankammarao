package pkg1;

public class FindMaxValueofArray {
	

	

		public static void main(String[] args) {

			int[] m = new int[] { 25, 100, 74, 75, 5 };

			System.out.println("Array is");

			for (int i = 0; i < m.length; i++) {

				System.out.println(m[i]);
			}

			// Initialize maxValue with first element of array.
			int maxValue = m[0];

			// Loop through the array
			for (int i = 0; i < m.length; i++) {

				// Compare elements of array with maxValue and
				// if condition true, make maxValue to that
				// element

				if (m[i] > maxValue)

					maxValue = m[i];
			}

			System.out.println("Maximum element present in given array: " + maxValue);
		}
	}



