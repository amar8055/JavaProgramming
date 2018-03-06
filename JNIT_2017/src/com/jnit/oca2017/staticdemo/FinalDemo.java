package com.jnit.oca2017.staticdemo;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {
	public static final int X;
	public static final int Y=30;
	public final int r;
	static{
		X=20;
		//Y=40;
	}
	{
		System.out.println("In the instance initializer block");
		r = 40;
		System.out.println(r);
	}
	
	
	public static void main(String[] args) {
		final List<String>colors = new ArrayList<>();
		colors.add("red");
		colors.remove("red");
		//colors = new ArrayList<>();
		//colors = null;
		System.out.println(X);
		FinalDemo main;
		main = new FinalDemo();

	}

}
