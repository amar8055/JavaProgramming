package com.jnit.oca2017.overloadingDemo;

//Method signature should vary
//If a method declaration only changes in the return type, 
//that is not overloading and there will be compilation errors
//if there are many overloaded methods which can be , 
//then Exact type is called  followed by larger type ,Autoboxed and var args

public class OverLoading {

	public static void fly() {
		System.out.println(1);

	}

	// public int fly() {
	// System.out.println(1);
	//
	// }

//	public static void fly(int x) {
//		System.out.println("one");
//
//	}

	public static void fly(int x, int y) {
		System.out.println("two");

	}

//	public static void fly(long x) {
//		System.out.println("three");
//
//	}

	public static void fly(Integer x) {
		System.out.println("six");

	}

	public static void fly(Object x) {
		System.out.println("four");

	}

	public static void fly(int... x) {
		System.out.println("five");

	}

	public static void main(String[] args) {

		fly(4,5,6);
		fly(4);

	}

}
