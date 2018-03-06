package com.Interfaces.jnit;


// This is a CONCRETE class which provides implementation to the interface.
public class InterfaceImp implements interfaceDemo, Test
	{

	//@Override
	public void test() 
	{
		System.out.println("Method without Parameters");
	}
	
	public void test(int x)
	{
		
		System.out.println(interfaceDemo.x); // We can access an interface variable like this
	}

	//@Override
	public void dosomething() {
		
		interfaceDemo.print();
		System.out.println(demo());
				
	}

	public void dosomething(int x) {
		
		
	}

	@Override
	public void dosomething(int x, int y) {
		
		
	}

	public void saySomething(String s) {
		
		
	}

	@Override
	public void saySomething(int x) {
		
		
	}

	@Override
	public String demo() {
		interfaceDemo.super.demo();
		return "Hello ";
	}
	
	/*public void dosomething()
	{
		System.out.println("DoSomething");
	}
	*/
	


}
