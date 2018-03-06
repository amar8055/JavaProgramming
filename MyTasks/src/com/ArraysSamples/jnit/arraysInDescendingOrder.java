package com.ArraysSamples.jnit;

import java.util.Scanner;

public class arraysInDescendingOrder {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int myIntegers[] = getIntegers(5);			
		int sorted[] = sortIntegers(myIntegers);
		printArray(sorted);
		
	}

	
	 public static int[] getIntegers(int capacity)
	 {
		 int [] values = new int[capacity]; 
		 System.out.println(" Enter " + capacity + "integer values. \r");
		 
		 		
		 for(int i=0; i<values.length; i++)
		 {
			 values[i] = scanner.nextInt();
		 }
		  return values;
	 	 }
	 public static void printArray(int[] values)
	 {
		for(int i=0;i<values.length;i++)
		{
			System.out.println(" Element " +i+ " contents "	+values[i]);
		}
	 }
	 public static int[] sortIntegers(int[] values)
	 {
		  int [] sortedArray = new 	int[values.length];
		  for(int i=0;i<values.length;i++)
		  {
			  sortedArray[i]=values[i];
		  }
	 boolean flag = true;
	 int temp;
	 //Element 0     45
	 //Element 1     150
	 //Element 2      92
	 
	 
	 while(flag)
	 {
		 flag = false;
		 for(int i=0;i<sortedArray.length-1;i++)
		 {
			 if(sortedArray[i]<sortedArray[i+1])
			 {
				 temp=sortedArray[i];
				 sortedArray[i]=sortedArray[i+1];
				 sortedArray[i+1]=temp;
				 flag=true;
			 }
		 }
	 }
	 return sortedArray;
	 }




}

