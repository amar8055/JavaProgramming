package com.evenNumb.jnit;

public class EvenNumb {

	public static void main(String[] args) {
		
		
		System.out.println("Enter even numbers from 1 to 100");
		int i,j=100;
		for(i=1; i<j; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even =" +  i);
			}else
			{
				System.out.println("Odd =" +  i);
			}
		}
		
	}
	
}



