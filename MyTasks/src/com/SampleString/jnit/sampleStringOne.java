package com.SampleString.jnit;

import java.util.Arrays;

public class sampleStringOne {

	public static void main(String[] args) 
	{
		/* 
		
		 String A ="ABC";
		 System.out.println(A);
		System.out.println(A.hashCode());
		A =A+"DEF";
		System.out.println(A);
		System.out.println(A.hashCode());
		System.out.println(A);
		int[] numbers = new int[10];
		for (int i = 0; i <numbers.length; i++)//0123456789 //<=it throughs an exception
		 numbers[i] = i + 5;
		//0=0+5
		System.out.println(numbers[1]);
		*/
		
		
	/*	int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
		{
		System.out.println (numbers[i] + " ");
		}
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
		System.out.println(string + " ");  */
		
		int [] numbers = {3,2,1};
	    System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		
	}

}
