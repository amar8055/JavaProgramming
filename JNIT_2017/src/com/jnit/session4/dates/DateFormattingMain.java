package com.jnit.session4.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//DateTimeFormatter
public class DateFormattingMain {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(formatter.format(dateTime));//11/1/16(short),Nov 1, 2016(medium)
		DateTimeFormatter timeformatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(timeformatter.format(dateTime));
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yy/MMM/dd");
		String convertedDate = customFormatter.format(date);
		System.out.println(convertedDate);
		LocalDate localDate = LocalDate.parse(convertedDate,customFormatter);
		
	}

}
