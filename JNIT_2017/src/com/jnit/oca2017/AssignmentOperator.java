package com.jnit.oca2017;

public class AssignmentOperator {
	public static void main(String[] args) {
		
		byte b = 45;
		short s1 = 127;
		short s2 = 129;
		int i = 5;
		int x = b;
		
		float f = 98.5f;
		double d = 13.6;
		
		f =(float) d;	
		byte c =(byte) s1;
		System.out.println(c);
		
		// compound assignment operator( implicit casting)
		//i*=5;
		System.out.println(i);
		i =(int) (i*f);
		i *= f;
		System.out.println(i);
		
		
		System.out.print(2147483647+1); // -2147483648
		System.out.print(2147483647+2); // -2147483647
		
	}

}
