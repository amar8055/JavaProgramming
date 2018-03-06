package com.jnit.oca2017.accessmodifier2;

import com.jnit.oca2017.accessmodifier1.Animal;



public class Dog2 extends Animal {

	public String breed;

	public void checkInheritedMethod() {

		name = "Taffy";
		this.wagTail();// protected variables are inherited to child classes and
						// can be referenced by this
		super.wagTail();// super referes to the parent class

	}

	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		a.name;
		
		Dog2 d = new Dog2();// can only be referenced through child reference type
		d.checkInheritedMethod();
		d.wagTail();
		System.out.println(d.name);
	

	}
}
