package com.DateAndTime.jnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeSample {

	public static void main(String[] args) {
		System.out.println("Current Date : " +LocalDate.now());
		System.out.println("Current Time : " +LocalTime.now());
		System.out.println("Date and Time : " +LocalDateTime.now());
		
		
		//Create Just Date No Time
		
		LocalDate date1 = LocalDate.of(2017, Month.JANUARY, 20);
		
		//Month is a constant it is good practice to use Constants.
		
		
		//LocalDate
		
		LocalDate date2 = LocalDate.of(2017, 06, 05); 
		
		System.out.println(date1);
		System.out.println(date2);
		
		//LocalTime
		
		LocalTime time1 = LocalTime.of(12, 30);
		
		System.out.println(time1);
		
		date1= date1.plusMonths(1);
		
		System.out.println(date1);
		
		date1= date1.plusDays(9);
		
		System.out.println(date1);
		
		//LocalDateTime
		
		LocalDateTime d1 = LocalDateTime.of(date1, time1);
		
		System.out.println(d1);
		 
		LocalDateTime d2= LocalDateTime.of(2017, 06, 05, 12, 30, 45, 200);
		
		System.out.println(d2);
		
		//Chaining on the methods using Date and Time
		LocalTime time = LocalTime.of(12, 30);				//For chaining we combined 2 methods
															//Local Time and Date
		LocalDate date = LocalDate.of(2017, 06, 05); 
		
		LocalDateTime dateTime = LocalDateTime.of(2017, 06, 05, 12, 30).minusHours(2).minusMinutes(15);
		//We used to methods .minusHours and .minusMinutes
		System.out.println(dateTime);	
		
		
		//Immutable LocalDate Objects
		//Immutable in the sense when we try to implement on object of LocalDate i.e; "date3"
		//But if we try to implement on LocalDate.of we can see changes
		
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
	    date3.plusDays(10);
		System.out.println("LocalDate is Immutable : " +date3);
		
		//But if we try to implement on LocalDate.of we can see changes
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20).plusDays(10);;
		System.out.println("Mutable : " +date4);

		
		
		
	}

}
