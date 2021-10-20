package packg1;

public class StringBuffer1 {
	public static void main(String[] args) {
		
		
		
         //This is String
		String st1 = new String("Hii");
		String st2 = new String("Hello");

		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		
		//StringBuffer

		StringBuffer s1 = new StringBuffer("Hii");
		StringBuffer s2 = new StringBuffer("Hello");

		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s2.capacity());
		System.out.println(s1.append("sai"));
		System.out.println(s2.append("vishal"));
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s2.append("vishalsaisivakesavmaheshdasmurthi"));
		System.out.println(s2.capacity());
		System.out.println(s1.getClass().getName());

		// converting string to StringBuffer
		StringBuffer sb = new StringBuffer(st1);
		System.out.println(sb.getClass().getName());
		
		
// StringBuilder
		
		
		StringBuilder sbr1 = new StringBuilder("Hello");
		StringBuilder sbr2 = new StringBuilder("Hello");
		System.out.println(sbr1.capacity());
		System.out.println(sbr1.append("sai"));
		System.out.println(sbr2.capacity());
		System.out.println(sbr1.append("saisivamarkhenrichbuildermatbatchitcomesmarklouise"));
		System.out.println(sbr1.capacity());
		System.out.println(sbr1.getClass().getName());

	}
}
