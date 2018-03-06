package com.EggInstance.jnit;

public class EggInstance
{
	int number;
	{
		number=7;
	}
	public EggInstance()
	{
		number=5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub              //Here the constructor initiates because it is not a Instance Block 
														// So, Constructor Block executes and gives the value 5.
		EggInstance EI = new EggInstance();
		System.out.println(EI.number);
		
	}
		
	
}
