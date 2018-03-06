package com.inheritance.jnit;

public class Child extends Parent {
	
	private int x=20;
	
	public Child()
	{
		//super(); //Used to invoke the parent class constructor and it has to be the 1st statement
		System.out.println("Inside Child class constructor");
	}
	public Child(int x)
	{
		super(x);
	}
	public void print()
	{
		super.print();// This will print parent class print method
		System.out.println(this.getX());
		System.out.println(super.getX());
		System.out.println("Inside Child Print");
		System.out.println(this.x);
	}
	
	//@Override
	 static void sayhello()
	{
		//Parent.sayhello();// A Static method can be called directly with the class name.
		//System.out.println("Say Hello Child");
	}
	 
	 //Covariant Data Types 
	public Integer coVariant() throws Exception
	 {
		 return 1; //Number is the Parent..Integer is the Child
	 }
	
	@Override
	public String toString() {
	
		return super.toString() + Integer.toString(this.x);
	}
	
	public static void main(String args[])
	{
			
		//Child c  =new Child();
		Child c1 =new Child(); 
		//System.out.println(b.getX());//In Java Programming a class can inherit only one parent class
		//c1.print();
		//c1.sayhello();
		//Child.sayhello();// we can also call it with class name
		//Parent.sayhello();
		// Parent p = new Child();
		//c1.dosomething();
		c1.print();
		//p.print();
		System.out.println(c1);
}
}