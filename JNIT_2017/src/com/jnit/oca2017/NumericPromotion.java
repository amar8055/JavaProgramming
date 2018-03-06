package com.jnit.oca2017;

public class NumericPromotion {
	
	public static void main(String[] args) {
		byte b = 45;
		short s1 = 128;
		short s2 = 129;
		float f = 98.5f;
		double d = 134568.67;
		boolean bool = true;
		
		int i = b + s1;// byte, short, char are promoted to int first		
		float result = b+f;// applying an arithmetic operator b/w decimal and integral value converts to decimal data type
		double d1 = f+d;
		int s3 =s1*s2;
		System.out.println(!bool);
	}

}
