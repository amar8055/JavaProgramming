package com.jnit.oca2017.interfacedemo;

public interface EmployeePayment {

	public static final String COMPANY = "JNIT";

	public void paySalary();

	public default double payBonus() {
		return 500;

	}

	public default String choosePaymentMethod(String employeeCategory) {

		if (employeeCategory == "Contract") {
			return "cheque";
		} else {

			return "direct deposit";
		}

	}

	public static void sendEmail() {
		System.out.println("Email sent");
	}

}
