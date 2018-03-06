package com.jnit.oca2017.constructors;

public class Animal {

	String name;
	int age;

	public Animal() {
		
		System.out.println("Inside Animal's constructor");

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public Animal(String name, String breed) {
		super();
		this.name = name;
		
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	double getAverageWeight(){
		return 23.0;
		
	}

}
