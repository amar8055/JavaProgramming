package com.jnit.oca2017.accessmodifier1;

import java.io.ObjectInputStream.GetField;

public class Employee {

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", age=" + age
				+ ", address=" + address + ", lastName=" + lastName + "]";
	}

	private String firstName = "Tom";
	private int age = 25;
	private String address = "Flower Mound, Tx";
	String lastName ="Ford";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println("Name of the Employee is: " + e.firstName);
		System.out.println("Age of the Employee is: " + e.age);
		System.out.println("Address of the Employee is: " + e.address);
		

	}

}
