package com.jnit.oca2017;

public class Hello_World 
{

	static int testVariable;
	byte b = 127;
	long l = 1232324324324234234l;
	float f = 23.7f;
	double d = 4455.6;
	char c = 't';
	boolean bool = true;// test method is going to print some data
	String s = "123";

	/*
	 * test method is going to print some data
	 */

	public static void test()
	{

	//	int localVariable;
	   // System.out.println(localVariable);
		System.out.println("testing");// printing the value
		System.out.println(testVariable);
		System.out.println(0b10);
	}

	public static void main(String[] args) 
	{
		System.out.println(" hello World");
		test();

	}

}
