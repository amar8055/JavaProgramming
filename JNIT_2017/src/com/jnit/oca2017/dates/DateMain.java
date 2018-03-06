package com.jnit.oca2017.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
//java.time ->LocalDate, LocalDateTime, LocalTime
//we can not use new keywords on LD,LDT,LT
//immutable object

//Period and duration
public class DateMain {
	//yyyy-mm-ddThh:mm:ss:SSS
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();//Contains both a date and time but no time zone.ZonedDateTime has zone info
		LocalTime time = LocalTime.now();//hours, minutes,seconds and nano seconds
		System.out.println(today);
		System.out.println(dateTime);
		System.out.println(time);
		
		
//		public static LocalDate of(int year, int month, int dayOfMonth)
//		public static LocalDate of(int year, Month month, int dayOfMonth)
//		
		//public static LocalTime of(int hour, int minute)
		//public static LocalTime of(int hour, int minute, int second)
		//public static LocalTime of(int hour, int minute, int second, int nanos)
		
		
		//public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute)
//		public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
//		public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)
//		public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute)
//		public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
//		public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
//		public static LocalDateTime of(LocalDate date, LocalTime)
		
		//creating LocalDate and LocalTime objects
		LocalDate yesterday= LocalDate.of(2016, 5, 30 );
		System.out.println(yesterday);
		LocalDateTime ydt = LocalDateTime.of(2016, 5, 30, 10, 30);
		System.out.println(ydt);
		
		//minus and plus operations
		LocalDate modifiedDate = today.minusDays(15);
		System.out.println("printing manipulative operations on date : "+ modifiedDate);
		modifiedDate = modifiedDate.minusWeeks(2);
		System.out.println("Substracting weeks from date : "+ modifiedDate);
		
		LocalDate modifiedMonth = today.minusMonths(2);
		System.out.println("Substracting months from date : "+ modifiedMonth);
		LocalDate modifiedYear =today.minusYears(2);
		System.out.println("Substracting years from date : "+ modifiedYear);
		
		//chaining operations
		LocalDate chainedDate = today.minusDays(15).minusMonths(2);
		System.out.println("Chained Date :" +chainedDate);
		
		
		//period ofYears,ofMonths,ofDays,ofWeeks
		//Duration -> time
		
		LocalDate modifiedByPeriodDate1 = today.plus(Period.ofDays(30));
		System.out.println("period modified date is :"+ modifiedByPeriodDate1);
		LocalDate modifiedByPeriodDate = today.minus(Period.of(1, 2, 10));
		System.out.println("period modified date is :"+ modifiedByPeriodDate);
			
		//chaining not possible with period
		//dont chain static methods
		Period period = Period.ofYears(10).ofWeeks(2);
		System.out.println(today.plus(period));
		
		Period wrong = Period.ofYears(1);
		wrong = Period.ofWeeks(7);
		System.out.println(today.plus(wrong));
		
		//Date formatting
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		
		DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
				System.out.println(shortDateTime.format(dateTime1)); // 1/20/20
				System.out.println(shortDateTime.format(date1)); // 1/20/20
				//System.out.println(shortDateTime.format(time1)); // UnsupportedTemporalTypeException
	
	
	
				DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
				System.out.println(dateTime.format(f));
	
				DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
				LocalDate date2 = LocalDate.parse("10 22 2015", f1);
				System.out.println(date2); 
	
	
	}

}
