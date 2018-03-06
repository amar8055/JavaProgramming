package com.Exceptions.jnit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//RuntimeException
public class RuntimeExceptionDemo {

	public static void main(String[] args)  {
		
		
		
		//	throwsDemo();
		runtimeDemo();

	}
	//"Demostrate throw exception"
	public static void executeSteps()
	{
		System.out.println("Executing step 1");
		System.out.println("Executing step 2");
		System.out.println("Executing step 3");
		System.out.println("Executing step 4");
	}
	public static void runtimeDemo()
	{
		Employee e = null;//we should get a null pointer exception
		e.print();
		System.out.println(e.COMPANY);
		System.out.println(Employee.COMPANY);
		//As we declared a static variable we can call it using class name
		//If company is the static field and they are bound to the class we dont get a null pointer exception
		
		String [] colors = new String[4];
		colors[4]="blue";
		
	}
		
		public static void throwsDemo()throws FileNotFoundException, SQLException
		{
			FileReader reader=null;
			
		
		try {
			 reader = new FileReader(new File("2.txt"));
			Connection con = DriverManager.getConnection("");
		} finally 	{
			if(reader != null)
			{
				try{
				reader.close();
				}
				catch (IOException e)
				{
				e.printStackTrace();
				}
				
			}
		}		
		
		
		}
	}
	

