package com.jnit.ocp2017.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxTest {
	public static void main(String[] args) {
		Toy toy1 = new Toy("Legos", "Blue");

		Box<Toy> toysBox = new Box<>();
		toysBox.setContents(toy1);
		System.out.println(toysBox.getContents());

	}

	public static <T> T test(T t) {

		List<String> x = new ArrayList<>();
		return t;

	}

}
