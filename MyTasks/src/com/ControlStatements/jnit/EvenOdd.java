package com.ControlStatements.jnit;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("even");
		}else
		{
			System.out.println("odd");
		}
		
	}

}
