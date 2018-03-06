package com.jnit.oca2017;

public class LocalVariableScope {
	 String name;
	 
	 public LocalVariableScope(){
		 
	 }
	 

	public String checkCategory(String name, int passedInAge) {

		String category;
		if (passedInAge >= 18) {
			category = "Adult";
			System.out.println(name + " is an " + category);
		}

		else {
			String x =" something";

			category = "child";
			System.out.println(name + " is a " + category);
		}

		return category;

	}

	public static void main(String[] args) {

		LocalVariableScope lv = new LocalVariableScope();
		System.out.println(lv.name);
		lv.checkCategory("Toby", 26);
		lv.checkCategory("Nikki", 2);
		//System.out.println(name);

	}

}
