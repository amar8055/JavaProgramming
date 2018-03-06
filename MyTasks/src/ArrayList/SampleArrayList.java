package ArrayList;

import java.util.ArrayList;

public class SampleArrayList {

	public static void main(String[] args) {
		
		/* ArrayList<String> safer = new ArrayList<>();
		safer.add("hawk");
		//safer.add(Boolean.True); // we cannot declare boolean when we use <string> generic
		//Does not Compile */
	/*	String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
		
		*/
		
		
	/*	
		
		String s = "Hello";
	    String t = new String(s);
	 if ("Hello".equals(s)) System.out.println("one");
	 if (t == s) System.out.println("two");
	 if (t.equals(s)) System.out.println("three");
	 if ("Hello" == s) System.out.println("four");
	 if ("Hello" == t) System.out.println("five");
	}
	
	*/
		
		/*
		 * String s1 = "java";
		 
		 StringBuilder s2 = new StringBuilder("java");
		 if (s1 == s2)
			 System.out.print("1");
		if (s1.equals(s2))
		 System.out.print("2");
		 
		 				*/
		
		
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		 values.add(5);
		 values.set(1, 6);
		 values.remove(0);
		 for (Integer v : values) 
			 System.out.print(v);
}
}