package com.CommandLine.jnit;

/*public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);			//This Program Throughs an array index out of bond exception.
		System.out.println(args[1]);
	}

}
*/
	import java.util.*;
	public class CommandLine 
	{
	public static void main(String[] args)
	{
		Random r = new Random(); 						// DOES NOT COMPILE
		System.out.println(r.nextInt(10));
	}
}