package com.jnit.ocp2017.funcInterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;
//Supplier -> get()-> returns same object
public class SupplierMain {

	public static void main(String[] args) {
		Supplier<StringBuffer> sbufSupplier = new Supplier<StringBuffer>() {
			@Override
			public StringBuffer get() {
				return new StringBuffer();
			}
		};
		
		Supplier<StringBuffer> sbufSupplier2 = () -> new StringBuffer();
		Supplier<LocalDate> ldtSupplier = () -> LocalDate.now();
		LocalDate date = ldtSupplier.get();
		System.out.println(date);	
		
	}

}
