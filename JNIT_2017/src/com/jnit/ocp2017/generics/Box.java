package com.jnit.ocp2017.generics;

public class Box<T> {
	
	private T contents;
	
	public T getContents() {
		return contents;
	}
	
	public void setContents(T contents) {
		this.contents = contents;
	}
	
}
