package com.jnit.oca2017.inheritence;

public class SChild extends SParent {

	public static String getDetails() {
		return "johnson " + 25 + " Flower mound, TX";

	}

	public void printChildDetails() {
		System.out.println(getDetails());
	}

	public static void main(String[] args) {

		// calling the method using child reference
		SChild c1 = new SChild();
		c1.printChildDetails();
		c1.printParentDetails();

		// calling the method using parent reference
		SParent p1 = new SParent();
		p1.printParentDetails();

		// calling the method using the parent reference but pointing to the
		// child object
		SParent p2 = new SChild();
		p2.printParentDetails();

	}

}
