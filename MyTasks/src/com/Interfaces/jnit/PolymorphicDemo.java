package com.Interfaces.jnit;

import com.inheritance.jnit.Child;
import com.inheritance.jnit.Parent;

public class PolymorphicDemo {
	
	public static void print(interfaceDemo ifD) //We call this Polymorphic parameters
	{
		
	}
	
	public static interfaceDemo sayHii()
	{
		return new InterfaceImp();  //Polymorphic Return Type
	}
	
	public static void main(String[] args) {
		
		// interfaceDemo idD = new interfaceDemo(); // we cannot instantiate interfaces
		
		interfaceDemo idD = new InterfaceImp(); //We can create object with Parent (I) -> Child(C)
		
		Test t = new InterfaceImp(); // We can create another object with  Second (I) -> Child(C)
		
		//Since print is a static method so we can call it directly.
		
		print(new InterfaceImp()); // It is a static method we can always call it without a reference with Implemented class
		
		//Casting
		
		Parent p = new Child();
		
		//Child c = p; // We cannot assign a parent reference to a child reference
		
		Child c = (Child)p; //Casting Format //Explicit Cast we are Explicitly casting the parent to be of type child.
		
	//	Child c = p(Child); // Wrong Format
		
		Parent p1 = new Parent();
		
		Child c1 = (Child)p1;  // This will Compile fine but throw u an exception at the RunTime. You Cannot have child Referring to Parent Object
		
		//CompileTime Polymorphism is Overloading
		//RunTime Polymorphism is OverRiding 
	
	
	}

} 

