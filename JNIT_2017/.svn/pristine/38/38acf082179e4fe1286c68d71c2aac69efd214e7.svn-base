package com.jnit.oca2017.designpatterns;

public class EmployeeBuilder {

	private int id;
	private String name;
	private int age;
	private String address;
	private String phoneNumber;

	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public EmployeeBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Employee build() {

		return new Employee(this.id, this.name, this.age, this.address,
				this.phoneNumber);

	}

}
