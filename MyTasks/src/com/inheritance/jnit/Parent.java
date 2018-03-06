package com.inheritance.jnit;

public class Parent {

	 private int x=10;	
	 
	 private int y=20;
	
	public Parent()
	{
		System.out.println("Inside parent class constructor");
	}
	
	public Parent(int x)
	{
		this.x=x;
				
	}
	public int getX()
	{
		return x;
	}
	public void print()
	{
		System.out.println("This is Parent Print Method");
		System.out.println(this.x);
		
	}
	
	static void sayhello()
	{
		System.out.println("Say Hello Parent");
	}
	 public void dosomething()
	 {
		 print();
	 }
	 public Number coVariant() throws Exception
	 {
		 return 1;
	 }
	 @Override
	public String toString() {
		
		return new Integer(this.x).toString();
	}



}

