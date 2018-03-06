package com.jnit.oca2017.designpatterns;

public class BankinWithdrwalTest {
	
	public static void main(String[] args) {
		
		BankDayDepositSingleton bankDayDepositSingleton = BankDayDepositSingleton.getBankdaydepositsingleton();
		bankDayDepositSingleton.getwithdrawlAmount(500);
		bankDayDepositSingleton.getwithdrawlAmount(200);
		System.out.println("Remaining balance for the day is " +bankDayDepositSingleton.getOpeningAmountForDayDetails() +" $");
		
		
		
	}

}
