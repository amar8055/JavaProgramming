package com.jnit.oca2017.objectmetthods;

public class Employee{

	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	EmployeeType eType;
	
	
	/*static final String STATIC_EMPLOYEE_TYPE1= "FULLTIME";
	static final String STATIC_EMPLOYEE_TYPE2= "CONTRACT";
	static final String STATIC_EMPLOYEE_TYPE3= "PARTTIME";*/
	

	public Employee(int id, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee other = (Employee) obj;
			if (id == other.id) {
				return true;
			}

			return false;
		} else {
			return false;

		}
	}

}
