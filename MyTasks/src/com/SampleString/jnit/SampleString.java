package com.SampleString.jnit;

public class SampleString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	String s1="Wild Cats";
			String s2="Xenon";
			String s3=new String("Wild Cats 2");
			String s4=new String("Xenon");
			s2=s1;
			System.out.println(s1.concat(s2));
			System.out.println(s1.concat(s3));
												*/
		String s1="1";		//1
		
		String s2=s1.concat("2");	//12
		
		s2.concat("3");			//123
		
		String s3 ="AmarReddy";
	//	System.out.println(s2);	//12  /* Here the value didnt change because String is immutable the value ll not change*/
		System.out.println(s3.indexOf(4));
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.indexOf("ar"));
		System.out.println(s3.indexOf("ar", 3)); //It checks at 3 index do we have a or not because execution starts from left hand side
												//so it prints -1
		System.out.println(s3.substring(4, 5));	//R
		System.out.println(s3.substring(5));	//eddy
		System.out.println(s3.substring(4, 4));	// It prints an empty string since the index is starting and ending at same position.
		//System.out.println(s3.substring(4, 10));// It throws an exception showing Index out of bond
		// System.out.println(s3.substring(4, 3)); // Exception when we are referring 2nd index prior to first string
		System.out.println(s3.toUpperCase().toLowerCase());//"amarreddy" when we call another method folled by it.It calls current method.
		
		/* Method chaning */
		
		String a = "abc";
		String b = a.toUpperCase();
		 b = b.replace("B", "2").replace('C', '3');
		 System.out.println("a=" + a);
		 System.out.println("b=" + b);
		
		 /* String Builder*/
		 
		 String alpha = "";
		 for(char current = 'a'; current <= 'z'; current++)
		 alpha += current;
		 System.out.println(alpha);
		  
	}
}
