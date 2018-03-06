package com.Multiple.jnit;
/*Write a program to print fizz if a number is a multiple of 3, “buzz” if it is a multiple of 5, “fizz 
buzz” if it is a multiple of both 3 and 5 and not multiple of 3 and 5 if the number is not a multiple 
of 3, 5( print it for numbers from 1-100)*/

public class Multiples {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
															// formula to find the multiples of 3 and 5 = N*(N+1)/2
				System.out.println("Fizz" + "\t" + i);
			} else if (i % 5 == 0) {
				System.out.println("Buzz" + "\t" + i);
			} else if (i % 3 == 0 || i % 5 == 0) {
				System.out.println("FizzBuzz" + "\t" + i);
			}

		}
																
	}

}
