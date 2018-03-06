package com.DateAndTime.jnit;

import java.time.*;

public class PeriodSample {

	public static void main(String[] args)
	  {
			LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
			LocalDate end = LocalDate.of(2015, Month.AUGUST, 30);
			performAnimalEnrichment(start, end);
	  }
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end)
	{
			LocalDate upTo = start;
			while (upTo.isBefore(end)) // check if still before end
		{ 
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusDays(1).plusMonths(1); // add a month
			System.out.println("No.of Days Starting  1970,Jan 1:" +start.toEpochDay());
			
		}
	}
}


