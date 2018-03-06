package com.variablesDataTypes.jnit;

public class VariableDataTypes {

	public static void main(String args[]) {
		/*
		 * int a=10; int b=20; int c=a+b; System.out.println(c);
		 */

		/*
		 * byte a=128; byte b=130; //we are exceeding the range of byte which is
		 * 127 if you still want to execute this program we have "TYPECAST" it
		 * to INt. byte c=a+b;
		 */

		byte a = (byte) 128;		//Here the problem is the range is 127 
		byte b = (byte) 128;		//As we are exceeding the range we are using TYPECASTING 
		byte c = (byte) (a + b); 	//The Output in here is 0 because after the range we are left with 2 
		System.out.println(c);		//in byte a we left with one and in b we are left with 1 so both are substracted 1-1=0

	}

}
