package com.Interfaces.jnit;

//We don't have regular methods and no members  

/*
 *  In interfaces a variable is by default static and final
 *  so we have to do the declaration in the start itself. 
 */


//We cannot create an objects in interfaces

//Methods are abstract and public in nature so,we cannot write private,protected

//we can implement Morethan one interface

//An interface can extend from another interface but it cannot implement from another interface

//Its not mandatory to implement methods

//we can write static methods inside your interface and we can use default methods inside your interface

// Functional Interface => It has single abstract method 

public interface interfaceDemo {
	
	int x=10;
	
	
	//Method Overloading same method with different parameters
	
	void test(int x);// A method is by default public and abstract in nature
	
	 void test(); // A method is by default public and abstract in nature
	 
	 void dosomething(); // We can have similar methods in multiple interfaces.
	 
	 void saySomething(int x);
	 
	 static void print()
	 {
		 System.out.println("Apple");
	 }

	 public default String demo()
	 {
		 return "Hi to";
	 }
}
