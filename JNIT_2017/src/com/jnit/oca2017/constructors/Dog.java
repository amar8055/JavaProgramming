package com.jnit.oca2017.constructors;

public class Dog extends Animal {
	
	String breed;

	public Dog(String breed) {
		this.breed = breed;
		System.out.println("Inside Dog's constructor");
	}
	
	public Dog(){
		this("Shih-tzu");
		System.out.println("Inside Dog's no argument constructor");
		System.out.println(this.name);
		System.out.println(super.name);
		
	}
	
	
	double getAverageWeight(){
		return 25.0;
		
	}

	static void test(){
		
		System.out.println(new Animal().getAverageWeight());
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.name = "Zoey";
		System.out.println(d.getAverageWeight());
		test();
		
		
		
		
		
		
		
	}
	

}
