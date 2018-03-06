package com.jnit.oca2017.exceptions;

public class CustomFileReader implements AutoCloseable {

	@Override
	public void close() throws CustomException {
		throw new CustomException("This is my Custom Exception");

	}

}
