package com.jnit.ocp2017.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//Set -> not an ordered collection, it doesn't allow duplicates
//HashSet -> LinkedHashSet((LinkedList + HashSet)it maintains insertion order)
//TreeSet impls SortedSet,NavigableSet -> Sorted order(doesn't use hashcode or equals method)
//Treeset doesn't allow null elements
public class SetMain {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("blue");
		colors.add("red");
		System.out.println(colors.size());
		for (String color : colors) {
			System.out.println(color);
		}
		// hashcode and equals implementation to identify duplicates
		Student s1 = new Student("John", "Lewisville");
		Student s2 = new Student("John", "Coppell");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());

		for (Student s : students) {
			System.out.println(s);
		}

		System.out
				.println(students.contains(new Student("John", "Lewisville")));

		// Comparable interface and CompareTo method
		Set<String> colorsSet = new TreeSet<>();
		colorsSet.add("red");
		colorsSet.add("blue");
		colorsSet.add("green");
		colorsSet.add("red");

		for (String s : colorsSet) {
			System.out.println(s);
		}
		// lexicographic comparison
		Set<Employee> employeesSet = new TreeSet<>();
		Employee e1 = new Employee(1, "John", "Lewisville");
		Employee e2 = new Employee(3, "Mike", "Denton");
		Employee e3 = new Employee(11, "Mike", "Coppell");
		Employee e4 = new Employee(211, "John", "Bradburry");
		Employee e5 = new Employee(151, "John", "Albany");
		Employee e6 = new Employee(19, "John", "Albany");
		
		
		employeesSet.add(e1);
		employeesSet.add(e2);
		employeesSet.add(e3);
		employeesSet.add(e4);
		employeesSet.add(e5);
		employeesSet.add(e6);

		System.out.println(employeesSet.size());

		for (Employee e : employeesSet) {
			System.out.println(e);
		}
		System.out.println();

		// functional interface - only one abstract method
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId().compareTo(o2.getEmpId());
			}
		};
		
 
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.addAll(employeesSet);
		Collections.sort(employeeList, comparator);
		System.out.println("Printing through comparator");
		System.out.println();
		for (Employee e10 : employeeList)
			System.out.println(e10);

		// NavigableSet(ceiling, floor, higher, lower, pollfirst, polllast)
		NavigableSet<Integer> navset1 = new TreeSet<>();
		navset1.add(1);
		navset1.add(2);
		navset1.add(3);
		navset1.add(4);
		navset1.add(5);

		System.out.println(navset1.ceiling(3));// >= 3
		System.out.println(navset1.floor(3));// <= 3
		System.out.println(navset1.higher(3));// > 4
		System.out.println(navset1.lower(3));// < 2
	

	}

}
