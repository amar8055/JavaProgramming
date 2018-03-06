package com.jnit.oca2017.objectmetthods;

import java.util.HashSet;

public class Equals {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Anusha", "FLOWER MOUND,TX", "5852609158");

		Employee e2 = new Employee(2, "Anika", "FLOWER MOUND,TX", "5852609158");

		Employee e3 = new Employee(3, "John", "LEWISVILLE,TX", "5852609158");

		Employee e4 = new Employee(4, "Jim", "PARLIN,NJ", "5852609158");

		Employee e5 = new Employee(4, "Jim", "PARLIN,NJ", "5852609158");

		// Equals
		System.out.println(e1.equals(e1));// reflexive
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e1));// symmetric
		System.out.println(e1.equals(null));

		// hashcode

		HashSet<Employee> hashSet = new HashSet<>();

		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		hashSet.add(e4);
		hashSet.add(e5);

		for (Employee emp : hashSet) {

			System.out.println(emp);
			System.out.println(emp.hashCode());

		}
		
		//System.out.println((new Employee(1, "Anusha", "FLOWER MOUND,TX", "5852609158") .hashCode()));

		System.out.println(hashSet.contains(new Employee(1, "Anusha", "FLOWER MOUND,TX", "5852609158") ));

	}

}
