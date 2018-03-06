package com.jnit.oca2017.interfacedemo;

public class EmployeeMain {

	public static void processEmployeePayment(EmployeePayment employee) {

		employee.paySalary();

	}

	public static void main(String[] args) {
		EmployeePayment teachingEmployee = new TeachingStaff("Contract", 7000.0);
		EmployeePayment nonTeachingEmployee = new NonTeachingStaff("FullTime", 4000.0);
		processEmployeePayment(teachingEmployee);
		processEmployeePayment(nonTeachingEmployee);

	}

}
