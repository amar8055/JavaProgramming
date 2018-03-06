package com.jnit.oca2017.designpatterns;
// instance of the singleton class can be created directly in the class or static blocks or in the get method call itself
public class BankDayDepositSingleton {

	private int openingAmountForDay = 5000;
	
	

	private BankDayDepositSingleton() {

	}

	private static final BankDayDepositSingleton BankDayDepositSingleton = new BankDayDepositSingleton();

	public static BankDayDepositSingleton getBankdaydepositsingleton() {
		return BankDayDepositSingleton;
	}

	public synchronized int getwithdrawlAmount(int amount) {

		if (amount <= openingAmountForDay) {
			openingAmountForDay = openingAmountForDay - amount;
			System.out.println("Withdrawing amount is " + amount + " $");
			return amount;
		}

		else {

			System.out
					.println("Requested withdrawl amount is not available. Please try tomorrow");
			return 0;

		}
	}

	public synchronized int getOpeningAmountForDayDetails() {
		return this.openingAmountForDay;

	}

}
