package lab3;

public class ImageString {

	public static void main(String[] args) {

		String str = "Rama";

		System.out.println("Mirror String is: " + getImage(str));

	}

	// logic for reverse the string
	
	public static String getImage(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		// mirror the string
		
		str = str + "|" + reverse;
		return str;

	}
}
