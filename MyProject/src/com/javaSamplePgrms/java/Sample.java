package com.javaSamplePgrms.java;

public class Sample 
{
	int a;
	int b;
	int c;
	
	

	public static void main(String[] args)
	{

		Sample sm =new Sample();
		sm.a=10;
		sm.b=20;
		sm.c=30;
			
		int total= sm.a+sm.b+sm.c;
		
		System.out.println("Addition of two numbers is " +total);
	
		}
}