package com.jnit.oca2017.inheritence;

public class Child extends Parent {
	
	protected String homeCountry ="UK";
	
	//getDetails method is being overridden

	public String getDetails() {
		return "johnson " + 25 + " Flower mound, TX";

	}
	
	public void printChildDetails(){
		System.out.println(getDetails());
	}
	
	// private methods from the parent can never be overriden as they are not accesible from the Child
	private String getAddress(){
		return "Flower mound, TX";
		
	}
	
	
	public String getHomeCountry() {
		return homeCountry;
	}
	
	//cannot override a final method in the child class
//	public   double getSalaryDetails(){
//		return 4000.00;
//		
//	}

//***********************************************************************************************************************************
//Testing the overriden methods, private methods and hidden variables
	
	public static void main(String[] args) {
		
		//calling the method using child reference
		Child c1 = new Child();
		c1.printChildDetails();
		c1.printParentDetails();
		//System.out.println(c1.getSalaryDetails());
		//FINAL methods are still inherited but cannot be overridden
		
		//calling the method using parent reference
		Parent p1 = new Parent();
		p1.printParentDetails();
		
		//calling the method using the parent reference but pointing to the child object
		Parent p2 = new Child();
		p2.printParentDetails();
		
		
		//calling private methods
		//p1.getAddress();
		System.out.println(c1.getAddress());
		
		
		//Testing variable hiding
		System.out.println(c1.getHomeCountry());
		System.out.println(p1.getHomeCountry());
		System.out.println(p2.getHomeCountry());
		
		
		
		
		
	}

}
