package com.Exceptions.jnit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*We can do this without catch block
we can instead use throws to throw the exception*/
public class FinallyDemo {
	
	public static void main(String[] args) 
	{
		try {
			finalDemo();
			//FileNotFoundException | SQLException
			//As Exception is parent of all the exceptions u can also do this
		} catch (Exception e) {
			 
			if(e instanceof SQLException)
			{}
			else{}
			e.printStackTrace();
		}
		//Main is the caller of the method
	}
		//Throws is not responsible for handling the exception it can only throw the exception
	//U can throw FileNotFoundException, SQLException or simply u can throw parent of all the exceptions
	public static void	finalDemo() throws Exception
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
