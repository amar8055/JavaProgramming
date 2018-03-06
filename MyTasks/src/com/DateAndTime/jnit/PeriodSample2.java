package com.DateAndTime.jnit;

import java.time.*;


public class PeriodSample2 {

	public static void main(String[] args)
   {
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1).ofYears(1).ofDays(2); // create a period
		//Period with chaining
		
	
		
		//Period annually = Period.ofYears(1); // every 1 year
		//Period quarterly = Period.ofMonths(3); // every 3 months
		//Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		//Period everyOtherDay = Period.ofDays(2); // every 2 days
		//Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
		
		
		performAnimalEnrichment(start, end, period);
	}
		private static void performAnimalEnrichment(LocalDate start, LocalDate end,
		Period period) { // uses the generic period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) 
		{
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plus(period); // adds the period
		}
		
	}

}


