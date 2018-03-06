package com.Project_Z;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {

		List<Employee> orders = new ArrayList<>();

		LocalDate d = LocalDate.of(2015, 10, 22);

		Employee emp = new Employee("jane", "smith", "usa", d);

		LocalDate d1 = LocalDate.of(2000, 10, 10);
		Employee emp1 = new Employee("jack", "smith", "usa", d1);

		LocalDate d2 = LocalDate.of(1999, 9, 9);
		Employee emp2 = new Employee("alan", "perry", "usa", d2);

		LocalDate d3 = LocalDate.of(2004, 5, 5);
		Employee emp3 = new Employee("ravi", "patel", "usa", d3);

		LocalDate d4 = LocalDate.of(1995, 7, 9);
		Employee emp4 = new Employee("amelia", "rusu", "usa", d4);

		LocalDate d5 = LocalDate.of(1997, 3, 6);
		Employee emp5 = new Employee("john", "striely", "usa", d5);

		LocalDate d6 = LocalDate.of(1997, 7, 9);
		Employee emp6 = new Employee("kate", "smith", "usa", d6);

		LocalDate d7 = LocalDate.of(2012, 7, 8);
		Employee emp7 = new Employee("olivia", "montgomery", "usa", d7);

		LocalDate d8 = LocalDate.of(2007, 6, 9);
		Employee emp8 = new Employee("stacy", "keeth", "usa", d8);

		LocalDate d9 = LocalDate.of(2010, 4, 1);
		Employee emp9 = new Employee("david", "ross", "usa", d9);

		orders.add(emp);
		orders.add(emp1);
		orders.add(emp2);
		orders.add(emp3);
		orders.add(emp4);
		orders.add(emp5);
		orders.add(emp6);
		orders.add(emp7);
		orders.add(emp8);
		orders.add(emp9);

		for (Employee employee : orders) {

			if ((employee.getFirstname()).contains("i")) {
				System.out.println("Firstname Starts with i:" + employee);
			}

			if ((employee.getLastname()).contains("y")) {
				System.out.println("Lastname Starts with y:" + employee);

			}

		}

		System.out.println(
				"===========================================================================================================================");

		for (Employee employee : orders) {

			if (employee.getJoiningdate().getMonth().toString().equalsIgnoreCase("July")) {
				System.out.println(employee);
			}
			if (employee.getJoiningdate().getMonth().toString().equalsIgnoreCase("May")) {
				System.out.println(employee);
			}

		}

		System.out.println(
				"==================================================================================================================================");
		System.out.println("Calculate Employee Projected Retirement Date");
		System.out.println();

		for (Employee employee : orders) {

			Period p = Period.ofYears(30);

			System.out.println(employee.getJoiningdate().plus(p));
			

		}

		System.out.println(
				"==================================================================================================================================");
		System.out.println("Printing by reversing the First and Last names");
		System.out.println();

		for (Employee employee : orders) {

			String s = employee.getFirstname();
			String s1 = employee.getLastname();
			StringBuilder sb = new StringBuilder(s);
			StringBuilder sb1 = new StringBuilder(s1);
			employee.setFirstname(sb.reverse().toString());
			employee.setLastname(sb1.reverse().toString());
			System.out.println(employee);

		}

	}

}

// Reverse the List
// private static void reverse(List<Employee> orders) {

// if(orders.size()>1) {
//
// Employee val = orders.remove(0);
// reverse(orders);
// orders.add(val);
// System.out.println(val);
//
// }
