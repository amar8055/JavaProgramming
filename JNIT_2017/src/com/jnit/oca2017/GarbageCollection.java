package com.jnit.oca2017;

public class GarbageCollection {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAddress("Flower Mound,TX");
		s1.setFirstName("Anusha");
		s1.setLastName("Tiyyagura");
		
		System.out.println("FirstName is: " +s1.getFirstName() + 
				" LastName is: "+ s1.getLastName() +" Address is: "+ s1.getAddress());
		
		Student s2 = new Student();
		s2.setAddress("Lewisville,TX");
		s2.setFirstName("Appi");
		s2.setLastName("Bhimavarapu");
		
		System.out.println("FirstName is: " +s2.getFirstName() + 
				" LastName is: "+ s2.getLastName() +" Address is: "+ s2.getAddress());
		
		s1=s2;
		
			
		System.out.println("FirstName is: " +s1.getFirstName() + 
				" LastName is: "+ s1.getLastName() +" Address is: "+ s1.getAddress());
		
		System.gc();
		
		
		
	}

}