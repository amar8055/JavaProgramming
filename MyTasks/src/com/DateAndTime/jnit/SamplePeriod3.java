package com.DateAndTime.jnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SamplePeriod3 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 05);
		LocalDate date2 = LocalDate.of(2017, 06, 05);
		LocalTime time = LocalTime.of(11, 59, 34);
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		// LocalDateTimeFormatter DateTimeFormatter = LocalDateTimeFormatter.
		
	//	Period period = Period.ofMonths(1).ofDays(2);
		
	//	System.out.println(date.plus(period)); // It Adds plus one month to the Period.
		
		//Chaining for Periods
		
	//	System.out.println(period.ofMonths(2).ofDays(10));// This give you Irrelevant result
		
	//	System.out.println(period);
		
	//	System.out.println(date.equals(period));//False
		
		System.out.println(date==date2); // False because it doesnt work like strings or Arrays
		
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		System.out.println(date.hashCode());
		
		System.out.println(date2.hashCode());
		
		
		// LOCALIZED DATE
		DateTimeFormatter shortDateTime =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//System.out.println(time.format(shortDateTime)); // 1/5/17 as we are using only localizedDate it will display only short Date. 
							//if we use both localizedDateTime it will display both
		
		System.out.println(date.format(shortDateTime)); // This throws an exception only localizedTime will work.	
	
		DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		System.out.println(dateTime.format(medium));
		
		//OUR OWN PATTERN
		
		DateTimeFormatter f= DateTimeFormatter.ofPattern("MMMM dd, yyy, hh:mm ");
		
		System.out.println(dateTime.format(f)); //January 05, 2017, 11:59 
		
		DateTimeFormatter f1= DateTimeFormatter.ofPattern("MM , dd , yy : hh:mm "); //We can always change the pattern as you like
		
		System.out.println(dateTime.format(f1)); // 01 , 05 , 17 : 11:59  
		
		DateTimeFormatter f2= DateTimeFormatter.ofPattern("MM , dd , yyyy"); 
		
		LocalDate date1 = LocalDate.parse("01 05 2017", f2);
		
		System.out.println(date1);
		
		
		
		
		
	
		
		
		
	}

}
