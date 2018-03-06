package com.jnit.oca2017.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void readFile() throws IOException {

		File file = new File("/Users/anushatiyyagura/Desktop/test.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int x = fileReader.read();
			System.out.println(x);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (fileReader != null)
				fileReader.close();

		}

	}

	public static void main(String[] args) throws IOException {
		test();
		//readFile();

	}

	public static void test() {

		try (CustomFileReader fileReader = new CustomFileReader()) {
			throw new IllegalArgumentException("illegal arument exception ");
		} catch (Exception e) {
			System.out.println(e);

			for (Throwable e1 : e.getSuppressed()) {

				System.out.println(e1);

			}

		}

	}

	public static void readFilewithTryWithResources() throws IOException {
		
	

		File file = new File("/Users/anushatiyyagura/Desktop/test.txt");
		//try with resources can take any class  that implements  AutoCloseable(throws  exception) or closeable interface(throws IOexception)
		//resources are closed in the reverse order
		try (FileReader fileReader = new FileReader(file)) {

			int x = fileReader.read();
			System.out.println(x);

		}

	}

}
