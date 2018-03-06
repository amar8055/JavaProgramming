package com.Interfaces.jnit;

public interface Test {
	
	void dosomething(int x);

	void dosomething(int x, int y);
	
	void saySomething(String s);

	public default String demo()
	 {
		 return "Hello to";
	 }


}
