package pkg1;

import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

		String str1 = "020-26231407";
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}", str1));

		String str2 = "flyingreturn.base@airindia.in";
		String str3 = "star.retros@airindia.in";

		System.out.println(Pattern.matches("\\w{1,}.\\w{1,}@airindia.in", str2));
		System.out.println(Pattern.matches("\\w{1,}.\\w{1,}@airindia.in", str3));
		
		
		String str4 ="1860 233 1407";
		System.out.println(Pattern.matches("[0-9]{4}\s[0-9]{3}\s[0-9]{4}", str4));
		
		
		
		
	}

}
