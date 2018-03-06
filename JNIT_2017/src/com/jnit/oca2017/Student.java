package com.jnit.oca2017;

public class Student {
	private String firstName;
	private String lastName;
	private String Address;

	public Student(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		Address = address;
	}

	public Student() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {

		Address = address;
	}

}

