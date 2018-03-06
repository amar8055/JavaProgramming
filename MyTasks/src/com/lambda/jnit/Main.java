package com.lambda.jnit;

public class Main {

	public static void main(String[] args) {

		// Anonymous Types for interfaces, Abstract Class and We can use this
		// for Regular Class as well.

		/*
		 * Anonymous Class is a class which does not have a NAME the Class
		 * CREATION and INSTANCE creation happens at the same time. like wise we
		 * have Anonymous Functions As well.
		 *
		 */

		// Anonymous Class Version 1

		Test t = new Test() {

			@Override
			public void print() {

				System.out.println("Hiiii......."); // Java Compiler creates an
													// additional .class file
													// while Compiling this file
													// for Anonymous Types

			}
		};

		t.print();

		// Version 2

		Test t2 = () -> System.out.println("Welcome to Anonymous Class......."); // Lambda
																					// Expressions
																					// Actually
																					// Overcomed
																					// such
																					// problems
		t2.print();

		Test t3 = () -> System.out.println(""); // If u have only one statement
												// u can remove this '{}'
		t3.print();

		// version 3

		Printer p = new Printer() {

			@Override
			public String print(String s) {

				return s.toUpperCase();
			}
		};

		p.print("Hello String");

		// Version 4

		Printer p1 = (String s) -> s.toUpperCase();

		System.out.println(p1.print("Rohi"));

		// Version 5

		Printer p2 = (s) -> s.toLowerCase();

		System.out.println(p2.print("ROHINI REDDY CHALLA"));

		// Version 6

		Printer p3 = s -> s.toLowerCase();
		p3.print("AA");

		// Version 7
		// Here is the example where if one statement present in your body of
		// your notation.

		PrinterI pi = new PrinterI() {

			@Override
			public String print(String s1, int s2) {
				s1.toLowerCase();
				// s2.toUpperCase();
				return s1 + s2;
			}
		};

		// Version 8

		PrinterI pi2 = (String s1, int s2) -> {
			s1 = s1.toLowerCase();
			return s1 + s2;
		};

		System.out.println(pi2.print("AMR", 102));

	}

}
