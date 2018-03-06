package com.jnit.oca2017.interfacedemo;

public class NonTeachingStaff extends Employee implements EmployeePayment {

	@Override
	public void paySalary() {
		
		paymentMethod = choosePaymentMethod(employeeCategory);
		salary = salary+ payBonus();
		System.out.println("Paying " + salary + " to" + " NonTeachingStaff "+ " through " + paymentMethod +  " from " + COMPANY);
		EmployeePayment.sendEmail();

	}
	
	//default method from the interface is being overriden
	public double payBonus(){
		return 400.0;
		
	}

	public NonTeachingStaff(String employeeCategory, double salary) {

		this.employeeCategory = employeeCategory;
		this.salary = salary;
	}

}
