 package com.Exceptions.jnit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionMain {

	public static void main(String[] args) {
		FileReader reader;

		 try {
			 reader = new FileReader(new File("1.txt"));
		} catch (FileNotFoundException e) {
			
	//If u have a try -> return statement -> will the finally block executed = yes
			
	//In ur try block if u have a statement like system.exit(0 or 1);0 means sucessful
	// 		1 means failure.
	/*This exception says that this file is not there.
	FileNotFoundException is the actual exception we are trying to catch 
	it inside a catch block.
		
			*/
			e.printStackTrace();
			try {
				 reader = new FileReader(new File("2.txt"));
				System.out.println("Print the second message");
				Connection con = DriverManager.getConnection("");
			} catch (FileNotFoundException | SQLException e1)
			//This feature is new from the version 1.7
			//we cannot have a catch block without try block
			//we cannot have try block without catch or finally.
			{
				e1.printStackTrace();
			}finally {
				System.out.println("Finally Block");
			}
		//Finally Block
		//A Finally Block will be executed for sure.
		//A Finally Block is a block which gets called irrespective of try and catch.
		}
		 	
				 
	}
}