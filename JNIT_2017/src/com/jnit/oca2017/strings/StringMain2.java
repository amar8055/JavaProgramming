package com.jnit.oca2017.strings;

public class StringMain2 {

	public static void main(String[] args) {
		//System.out.println("hello" == "hello");
		//System.out.println("hell"+"o" == "hello");
		
		
		
		//System.out.println("hell".concat("o") == "hello");
		
		
		
	/*	//String s1 = "helloWorld";
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		String start = "AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String results = lowercase.replace('a', 'A'); // "Animal"
		System.out.println(results); // String is Immutable            */
		
		
		
		/* 
		
		 StringBuilder sb = new StringBuilder("animals");
		 String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
										
											*/
		
		
		
		StringBuilder sb = new StringBuilder("animals");
		StringBuilder sb1 = new StringBuilder();
		
		//sb1=sb.substring('a');
		
		
		sb.insert(7, "-"); // sb = animals-
		 sb.insert(0, "-"); // sb = -animals-
		 sb.insert(4, "-"); // sb = -ani-mals
		 System.out.println(sb);
		 
		 
		 
		 String A ="Amar";
		 A.substring(0, 3);
		 System.out.println(A);
		
		
		
		
	/*	
		String a = "abc";
		String b = a.toUpperCase();
	     b = b.replace("B", "2").replace('C', '3');
	    System.out.println("a=" + a);
		System.out.println("b=" + b);   
										*/
		
		
		//System.out.println(s1+"o" == "hello");
	/*	System.out.println(s1.indexOf("AR", 5));
		System.out.println(s1.indexOf('W', 5));
		String s2 = s1 + "o";
		System.out.println(s2);
		System.out.println(s2 == "hello");
		System.out.println((s1+"o").intern() == "hello");
		String s3 = new String("hello");
		String s4 = s3.intern();

		String test = new String("jnit");
		System.out.println(test+ " technologies" == "jnit technologies");
	
												*/
	}

}
