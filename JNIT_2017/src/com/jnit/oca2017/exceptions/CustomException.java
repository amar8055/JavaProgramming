package com.jnit.oca2017.exceptions;

public class CustomException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}

}
