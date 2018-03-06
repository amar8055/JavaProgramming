package com.jnit.oca2017.methods;

public class Autoboxing {
	public static void main(String[] args) {

		Integer i = 20;
		// behind the scenes compiler will add these lines to conver the
		// primitive
		// int literal 20 to Intger object

		 i =Integer.valueOf(20);
		 
		 System.out.println(i);

	}

}
