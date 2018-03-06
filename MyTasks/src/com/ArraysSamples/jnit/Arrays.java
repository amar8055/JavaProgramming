package com.ArraysSamples.jnit;

public class Arrays {

	public static void main(String[] args) {
		
		
		//Method 1
		int [] myIntArray = new int[25]; // One way of Declaration
		
		//myIntArray = new int[20]; // Second Way of Declaration
		//myIntArray[5]= 20;
		//myIntArray[6]=30;
		//myIntArray[7]=40;
	
//		
//		//Method 2
//		// An Easy way to declare the value is as follows
//		int [] otherArray = {1,2,3,4,5,6,7,8,9,10,11,12};
//		System.out.println(otherArray[1]);
//		System.out.println(otherArray[5]);
//		System.out.println(otherArray[9]);
//		
		//Method 3
		//we can also use the for-loop to initialize the value
		for(int i=0;i<myIntArray.length;i++)
		{
			myIntArray[i]=i*10;		
			System.out.println(myIntArray[i]);//Instead of hard coding we can also use method .length
		}	
		
		
		
		printArray(myIntArray);
		//Method 4 : we can also use methods in Array
		
		
		}

		public static void printArray(int[] array)
		{
			for(int i=0;i<array.length;i++)
			{
				System.out.println(" Element "+i+" , value is "+array[i]);


		}
}
}