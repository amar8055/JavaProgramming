package com.StringBuilder.Jnit;

public class StringBuilderSample {

	public static void main(String[] args) {
		/*
		 String x= "Good";
		
		String x2="Good";  //"==" in strings compares 2 strings in a pool 
		String x3= new String("Apple");// It gives false when we compare == with pool string and heap string
		String x4=new String("Apple");
		
			System.out.println((x==x2)); //true
			System.out.println(x==x3); //false
			System.out.println(x3==x4);//false 
			System.out.println(x3.equals(x4));//It creates two different objects in the heap so it displays false
			System.out.println(x.equals(x3));
  		System.out.println(x.replace('o', 'b')); //
		System.out.println(x.charAt(4));
		System.out.println(x.substring(4));
		System.out.println(x.replace('G', 'B').concat("Alpha"));
		String y;
	//	y=x;
		y="Demolish";
		System.out.println(y);
		System.out.println(x.hashCode());
		System.out.println(y.hashCode()); */
		
		
		StringBuilder s2= new StringBuilder("Good");
		StringBuilder s3= new StringBuilder("Good");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));	// It compares reference here it displays: False
		
		String s4="Morning";
		String s5="Morning";
		String s6= new String("Morning");
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		
	//	System.out.println(x.toString());
	
	}

}
