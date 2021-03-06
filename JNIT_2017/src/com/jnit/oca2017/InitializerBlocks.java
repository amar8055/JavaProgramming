package com.jnit.oca2017;

public class InitializerBlocks {
	int x = 53;

	public InitializerBlocks() {
		this.x = x + 5;
		System.out
				.print("Reading and modifying the value of x inside the constructor: ");
		System.out.println(x);
	}

	// Fields and instance initializer blocks are run in the order in which they
	// appear in the file.
	// The constructor runs after all fields and instance initializer blocks
	// have run. 
	{
		System.out
				.print("Reading and printing the value of x inside the initializer blocks: ");
		System.out.println(x);
	}

	public static void main(String[] args) {
		InitializerBlocks ib = new InitializerBlocks();	
		System.out.print("printing the value in the main method:");
		System.out.print(ib.x);

	}

}
