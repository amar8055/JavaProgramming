package com.jnit.oca2017.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsDemo {

	public static void readFile() throws IOException {

		File file = new File("/Users/anushatiyyagura/Desktop/test.txt");
		FileReader fileReader = new FileReader(file);
		int x = fileReader.read();
		System.out.println(x);
		fileReader.close();

	}

	public static void main(String[] args) {

		try {
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Executing the finally block");
		}

		System.out.println("Executimg the last line of the main method");
	}

}
