package com.jnit.oca2017.exceptions;

public class ExceptionDemo {

	static String s = "";

	public static void m1() throws CustomException {

		s += "inside m1 ";
		System.out.println("inside m1 ");
		throw new CustomException("This is a custom exception");

	}

	public static void m2() {
		try {
			m1();
			//System.exit(0);
			s += " inside m2 ";
			System.out.println("finished executing m1");
		}

		catch (CustomException c) {
			
			System.out.println(c.message);
			s += "inside m2 catch ";
			System.out.println("inside catch block");
			//c.printStackTrace();
			// System.exit(0);
		}

		finally {
			s += " inside m2 finally";
			System.out.println("inside finally block");

		}
		s += " finishing m2 method";
		System.out.println("inside catch block");

	}

	// defining a parent exception first and a child exception later will result
	// in compilation errors
	public static void m3() {
		try {
			m1();
		} catch (Exception c) {

		}
		// catch (CustomException e) {
		//
		// }

	}

	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;

	}

	public static void main(String[] args) {

		m2();
		System.out.println(s);
		System.out.println(exceptions());
	}
}
