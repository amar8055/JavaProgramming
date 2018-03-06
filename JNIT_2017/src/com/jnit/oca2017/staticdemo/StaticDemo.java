package com.jnit.oca2017.staticdemo;

import static java.lang.Math.*;

public class StaticDemo {

	public static int x = 10;//static variables
	public int y = 20;//instance variables
	//utility methods->no need an object to call static methods
	//a static method can not access non static
	//a non static can call static/non static
	//utility methods doesn't require state to operate on
	//Math
	
	static{
		System.out.println("I am inside static initializer");
		x = 20;
	}
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static void print(){
		System.out.println(x);
		//nonStatic();
	}
	
	public void nonStatic(){
		print();
		add(10,20);
		nonStatic1();
	}
	
	public void nonStatic1(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("I am inside main method");
		StaticDemo sd = new StaticDemo();
		sd.x = 20;
		sd.y = 25;

		StaticDemo sd1 = new StaticDemo();
		sd1.x = 30;
		//sd1.y = 45;
		StaticDemo sd3 = new StaticDemo();
		
		System.out.println(sd.x);
		System.out.println(sd1.x);
		System.out.println(sd3.y);
		System.out.println(max(12, 15));
		System.out.println(PI);

	}
}
