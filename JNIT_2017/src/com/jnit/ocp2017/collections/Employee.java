package com.jnit.ocp2017.collections;

public class Employee implements Comparable<Employee>{

	private Integer empId;
	private String name;
	private String city;
	
	public Employee(Integer empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
	public int compareTo(Employee emp) {
		int x = this.getName().compareTo(emp.getName());
		if(x == 0){
			return this.getCity().compareTo(emp.getCity());
		}
		return x;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city
				+ "]";
	}

	
	
}
