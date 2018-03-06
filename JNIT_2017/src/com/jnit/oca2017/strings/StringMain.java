package com.jnit.oca2017.strings;
//String pool -> permanent generation area of heap
//Immutable in nature
public class StringMain {

	public static void main(String[] args) {
		String s1 = "hello";//s1 is created in string pool
		String s2 = new String("hello");//s2 is created inside heap memory
		String s3 = "hello";
		String s4 = new String("hello");
		
		//some of the commonly used methods inside our classes
		//----------------------------------------------------------
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf('h'));
		System.out.println(s1.indexOf("ll"));
		System.out.println(s1.indexOf("ll",3));
		System.out.println(s1.indexOf('l', 2));
		System.out.println(s1.lastIndexOf('l'));
		
		//------------------------------------------------------
		
		String s5 = " hello world ";
		System.out.println(s5.trim().toUpperCase());
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.endsWith("lo"));
		//System.out.println(s1.charAt(5));	
		//---------------------------------------------------------
		//substring, equals, equalsignorecase
		System.out.println(s1.substring(0, 2));
		System.out.println(s1.substring(2));
		String s10 ="".trim();
		System.out.println(s10.length());
		//------------------------------------------------------------
		//string equality ==(references) and .equals(contents)
		System.out.println(s1 == s3);//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2 == s4);//false
		System.out.println(s2.equals(s4));//true
		System.out.println("Hello".equalsIgnoreCase(s1));//true
		System.out.println(s1.contains("lo"));//true
		String s6 = s1.replace('h', 'b');
		System.out.println(s6);
		System.out.println(s1);
		String s7 = s1.replaceAll("l","b");
		System.out.println(s7);
		String s8 = s1.concat("world");
		s1 = null;
		String s9 = s1 + "world";
		System.out.println(s9);
		System.out.println(1+5+"10");
		System.out.println(1+""+5+"10");
		//
		

	}

}
