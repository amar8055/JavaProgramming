package com.jnit.oca2017;

public class IncrementDecrementOperator {
	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		int n1 = 5;
		int n2 = ++n1;
		int n3 = n2++ + ++n1;

		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);

		System.out.println(x++);
		System.out.println(y++);
		System.out.println(x);

		int result = 5 * 9 + 4 + ++x;
		System.out.println(result);
		System.out.println(x);
		System.out.println(y);

		int counter = 5;
		
		System.out.println();

		System.out.println(counter++);

		System.out.println(counter--);

		System.out.println(++counter);

	}
}
