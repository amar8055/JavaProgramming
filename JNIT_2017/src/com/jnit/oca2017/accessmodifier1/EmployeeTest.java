package com.jnit.oca2017.accessmodifier1;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e2 = new Employee();
		//System.out.println(e2.firstName);// private variables are visible to the
									// class where they are declared
		//System.out.println(e2.age);
		//System.out.println(e2.address);
		
		System.out.println(e2.getFirstName()); //We used getters to access it.
		System.out.println(e2.lastName); //It is not a private variable so we can access it
		System.out.println(e2.getAge());
		// public access modifier can be accessed from anywhere from different packages too
		System.out.println(e2.getAddress());
		
		
	/*	Animal a   = new Animal();
		a.name ="Zoey";
		a.wagTail(); */
		
//		Dog d = new Dog();
//		d.wagTail();

	}

}
