package lab2;

public class SecondSmallestElementArray {

	public static void main(String[] args) {
		int smallest=0 ;
		int secondSmallest=0;
		int[] elements = {0,  2, 10, 3, -1 };

		
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				
				if (elements[i] < smallest) {
					smallest = elements[i];

					if (elements[j] < smallest) {
						smallest = elements[j];
					}
				}
			}

		}

		System.out.println("The smallest element is: " + smallest );
		System.out.println("The second smallest element is: " + secondSmallest);
	}
}