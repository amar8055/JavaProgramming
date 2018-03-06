package com.jnit.oca2017.innerclasses;

import com.jnit.oca2017.innerclasses.InnerClass.NestedClass;

public class InnerClassTTest {
	
	public static void main(String[] args) {
		
		
		InnerClass i = new InnerClass();
		NestedClass n = i.new NestedClass();
		n.nestedMethod();
		
	}

}
