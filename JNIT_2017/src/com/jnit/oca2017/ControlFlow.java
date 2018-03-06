package com.jnit.oca2017;

public class ControlFlow {

	public void checkAge(String name, int age) {
		String category;

		if (age <= 1) {// OPENING AND CLOSING CURLY BRACES ARE NOT REQUIRED BUT,
			// IF NOT PRESENT ONLY THE FIRST STATEMENT GETS ESECUTED

			category = "infant";
			System.out.println(name + " is an " + category);
		} else if (age > 1 & age < 3) {
			category = "Toddler";
			System.out.println(name + " is a " + category);
		} else if (age > 3 & age < 18) {
			category = "child";
			System.out.println(name + " is a " + category);
		} else {
			category = "adult";
			System.out.println(name + " is an " + category);
		}

	}

	public static void main(String[] args) {
		ControlFlow cf = new ControlFlow();
		cf.checkAge("Toby", 1);
		cf.checkAge("Nikki", 2);
		cf.checkAge("Maria", 16);
		cf.checkAge("John", 60);

	}

}
