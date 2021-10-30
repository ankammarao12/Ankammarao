package lab6;

// The Program to Count Charactors in a Given Array

	import java.util.HashMap;
	import java.util.Map;

	public class CharCount {
		
		
		

		public static void main(String[] args) {
			
			// character array 
			
			char[] arr = new char[] { 'b', 'c', 'd', 'a', 'b', 'c', 'a', 'b', 'c', 'd' };

			

			Map<Character, Integer> m = new HashMap<Character, Integer>();

			for (int i = 0; i < arr.length; i++) {

				if (m.containsKey(arr[i])) {

					m.put(arr[i], m.get(arr[i]) + 1);
					
				} else {
					
					m.put(arr[i], 1);
				}
			}
			System.out.println(m);
		}
	}


