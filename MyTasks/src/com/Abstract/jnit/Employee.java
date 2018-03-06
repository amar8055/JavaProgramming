package com.Abstract.jnit;

public class Employee extends AbstractDemo {
	
	public int x=10;
	@Override
	public void print() {
		
		System.out.println("This is the implementation of Employee class");
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
	  AbstractDemo ab = new contractor();
	 // Test te = new Test(); 
	  ab.print();
	  //te.print();
	  
	}
}
