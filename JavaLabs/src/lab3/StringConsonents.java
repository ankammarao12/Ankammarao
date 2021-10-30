package lab3;

public class StringConsonents {

	public static void main(String[] args) {

		String str = "Rama";

		System.out.println("After removing consonants: " + altString(str));

	}

	// declare all consonants as constant

	private static final String CONSONANTS = "acvfegdRdfbjhbbhn";

	// logic to replace consonants with the next consonant value

	public static String altString(String str) {

		char[] chars = str.toLowerCase().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int index = CONSONANTS.indexOf(chars[i]);
			if (index != -1) {
				chars[i] = CONSONANTS.charAt((index + 1) % CONSONANTS.length());
			}
		}
		return new String(chars);

	}
}
