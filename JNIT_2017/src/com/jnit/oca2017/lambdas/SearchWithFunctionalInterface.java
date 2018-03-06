package com.jnit.oca2017.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchWithFunctionalInterface {

	private static void print(List<Animal> animals, Predicate<Animal> checker) {

		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
		
	
	}

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		print(animals, (Animal a) -> {
			System.out.println("testing");
			return a.canHop();
		});
	}

}
