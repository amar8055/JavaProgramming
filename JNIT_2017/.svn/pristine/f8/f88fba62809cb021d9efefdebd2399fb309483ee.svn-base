package com.jnit.ocp2017.fomatting;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numberformatting {

	public static void main(String[] args) throws ParseException {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
	System.out.println(attendeesPerMonth);
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		//currency instance
		BigDecimal price = new BigDecimal(48);
		NumberFormat usa = NumberFormat.getCurrencyInstance();
		System.out.println(usa.format(price));
		//parse method
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.Ab45";
		System.out.println(en.parse(s)); // 40.45
		System.out.println(fr.parse(s)); // 40
		
	}

}
