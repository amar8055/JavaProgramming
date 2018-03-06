package com.jnit.oca2017;

public class LogicalOperator {
	public static void main(String[] args) {
		// will perform a check on both the expressions
		int x =5;
		int y =7;
		if(x==5 | ++y ==8){
			System.out.println("inside the if block and executed the logical &");
			System.out.println(y);
		}
		
		if(x==5 || y ==8){
			System.out.println("inside the if block");
			System.out.println(y);
			System.out.println(x);
		}
		
		
	}

}
