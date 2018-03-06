package com.jnit.oca2017.innerclasses;

//LOCAL INNER CLASS
//They do not have an access specifier.
//■ They cannot be declared static and cannot declare static fields or methods.
//■ They have access to all fields and methods of the enclosing class.
//■ They do not have access to local variables of a method unless those variables are final
//or effectively final.

public class LocalInnerClass {

	private int length = 5;

	public void calculate() {

		final int width = 25;
		int height = 50;
		// height = 25; //changing the height variable value changes its effectively final  clause too
		// LOCAL INNER CLASS DEFINED INSIDE A METHOD
		class Inner {
			public void multiply() {

				System.out.println(length * width);
				System.out.println(length * height);

			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.calculate();

	}
}