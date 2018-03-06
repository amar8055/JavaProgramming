package com.InstanceInitialization.jnit;

	public class InstanceInitialization {
		String name="Tommy";
	{
		System.out.println("This is a Battle field");
	}
	public InstanceInitialization()
	{
		 name="Zimmy";
		System.out.println("This is a war field");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceInitialization is = new InstanceInitialization();
		System.out.println(is.name);
	}

} 
 
