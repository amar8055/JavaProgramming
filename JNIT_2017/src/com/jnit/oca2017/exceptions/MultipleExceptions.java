package com.jnit.oca2017.exceptions;

import java.io.FileNotFoundException;

public class MultipleExceptions {

	public static void m1() throws CustomException {

	}

	public static void m2() throws FileNotFoundException {

	}

	public static void main(String[] args) {
		try {
			m1();
			m2();
		} catch (CustomException  | FileNotFoundException e) {// multiple exceptions in one single catch block using pipe operator

			e.printStackTrace();
		}
	}
}