package com.jnit.oca2017.exceptions;

public class RunExceptionsDemo {

	public static void nullException(String string) {
		System.out.println(string.length());

	}

	public static void castException() {

		String string = "Test";
		Object object = string;
		Integer i = (Integer) object;

	}

	public static void arithmaticException() {
		System.out.println(12 / 0);
	}

	public static void arrayIndexException() {

		int[] c = new int[4];
		System.out.println(c[4]);

	}

	public static void main(String[] args) {
		nullException(null);// null pointer exception
		castException();// class cast exception
		arithmaticException();// arithmaticException
		arrayIndexException();// arrayIndexException

	}

}
