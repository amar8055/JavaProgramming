package com.jnit.oca2017.varargs;

public class VarArgsMain {

	public static void test(int... x) {

		// if (x == null) {
		// System.out.println("the reference variable value is null");
		// }

		if (x.length == 0) {
			System.out.println("The size of the array is 0");
		}

		for (int temp : x) {
			System.out.println(temp);
		}

	}

	public static void test2(String... x) {

		if (x == null) {
			System.out.println("the reference variable value is null");
			return;
		}

		for (String temp : x) {
			System.out.println(temp);
		}

	}

	public static void main(String[] args) {
		// varargs should always be the last parameter inside a method
		// which means there could only be one vararg inside a method parameter
		// list
		// if no arguments are passed to the varargs rhen a n array with size 0
		// is created
		// we can pass just one or any number of argumnets and they are
		// considered as an array
		// int x = 10;
		// test(x);
		// test(10, 20, 30);
		// test(new int[] { 3, 4, 5 });
		test();
		// test(null);
		test2(null);
		//test2((String) null);

	}

}
