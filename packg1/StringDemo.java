package packg1;

public class StringDemo {
	
		public static void main(String[] args) {
			String str1 = "Hello";
			String str2 = "Hello";
			String str5 = "hello";
			
			// equals vs ==
			// equals - content
			// == - reference
			System.out.println(str1 == str2); // true
			System.out.println(str1.equals(str2)); // true
			
			String str3 = new String("Hello");
			String str4 = new String("Hello");
			
			System.out.println(str3==str4);//false
			System.out.println(str3.equals(str4)); //true
			
			str3.concat(" World");
			System.out.println(str3); // Hello
			
			str3 = str3.concat(" World");
			System.out.println(str3); // Hello World
			
			// methods
			System.out.println(str1.charAt(1));
			System.out.println(str1.toLowerCase());
			System.out.println(str1.toUpperCase());
			
			System.out.println(str1.equals(str5)); // false
			System.out.println(str1.equalsIgnoreCase(str5)); // true
			
			// Comparing string lexicographically
			// return 0 - both string are same
			// str1 > str2 - +ve
			// str1 < str2 - -ve
			System.out.println(str1.compareTo(str2)); //0
			System.out.println(str1.compareTo(str5)); // -32
			System.out.println(str5.compareTo(str1)); // 32
			
			
			System.out.println(str1.contains("He")); //true
			
			String str6 = "Hello World";
			String[] str = str6.split(" ");
			for(String s: str) {
				System.out.println(s);
			}
			
			System.out.println(str1.indexOf("H")); //0
			
			// "Hello"
			System.out.println("Hello".substring(2)); //llo
			System.out.println("Hello".substring(1,4)); // el
			
			
			
			
			
}
}
