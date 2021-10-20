package packg1;

public class StringBufferDemo {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");

		  System.out.println(str1 == str2);// reference - false
		  System.out.println(str1.equals(str2)); // content - true

		 	StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println(sb1 == sb2); // reference - false
		System.out.println(sb1.equals(sb2)); // reference - false

		System.out.println(sb1.capacity()); // 16+5 = 21 - initial cap
		System.out.println(sb1.length());
		System.out.println(sb1.append("1234"));
		System.out.println(sb1.length());
		System.out.println(sb1.capacity()); // 21
		System.out.println(sb1.append("sadfagqwertyuioplkjhgfdsa"));
		System.out.println(sb1.capacity()); // (21*2)+2 = 44

		 	StringBuilder sbr1 = new StringBuilder("Hello");
		StringBuilder sbr2 = new StringBuilder("Hello");

		System.out.println();
		System.out.println(sbr1 == sbr2); // reference - false
		System.out.println(sbr1.equals(sbr2)); // reference - false

		System.out.println(sbr1.capacity()); // 21
		System.out.println(sbr1.length()); // 5
		System.out.println(sbr1.append("sadfagqwertyuioplkjhgfdsa"));
		System.out.println(sbr1.length()); // 30
		System.out.println(sbr1.capacity()); // 44

		System.out.println();
		System.out.println(sb1.getClass().getName()); // Object type - StringBuffer
		String str3 = new String(sb1);
		System.out.println(str3.getClass().getName()); // String

		System.out.println(str1.getClass().getName());// String
		StringBuffer sb3 = new StringBuffer(str1);
		System.out.println(sb3.getClass().getName()); // StringBuffer
		System.out.println(sb3.reverse()); 

	}
}
