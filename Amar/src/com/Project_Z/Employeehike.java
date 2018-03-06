package com.Project_Z;

public class Employeehike {
	
	protected String employeeName;
	protected int salary;
	protected int joiningDate;
	
	public Employeehike() {}
	
	public Employeehike(String employeeName, int salary, int joiningDate) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(int joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employeehike [employeeName=" + employeeName + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ "]";
	}
	
	public double salaryhike(double bypercent) {
		
		bypercent=12.0;
		
		return this.salary/bypercent;
		
	}
	

}
