package com.jnit.ocp2017.advancedStreams;

public class Customer {
	String name;
	String city;

	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + "]";
	}
}
