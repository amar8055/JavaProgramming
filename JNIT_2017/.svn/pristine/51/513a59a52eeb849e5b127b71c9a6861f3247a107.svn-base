package com.jnit.oca2017.interfacedemo;

public class TeachingStaff extends Employee  implements EmployeePayment  {

	@Override
	public void paySalary() {

		paymentMethod = choosePaymentMethod(employeeCategory);
		salary = salary + payBonus();// default method from the interface is being inherited and used without overriding it
		System.out.println("Paying " + salary + " to" + " Teaching staff"+ " through " + paymentMethod + " from " + COMPANY);
		EmployeePayment.sendEmail();

	}

	public TeachingStaff(String employeeCategory, double salary) {

		this.employeeCategory = employeeCategory;
		this.salary = salary;
	}

}
