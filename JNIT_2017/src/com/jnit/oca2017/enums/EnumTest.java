package com.jnit.oca2017.enums;

public class EnumTest {
	public static void main(String[] args) {
		


		System.out.println(Season.WINTER);
		System.out.println(Season.valueOf("SUMMER")); // SUMMER
		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		Season.SUMMER.printExpectedVisitors();
		Season.WINTER.printExpectedVisitors();
		Season.FALL.printExpectedVisitors();
		Season.SPRING.printExpectedVisitors();
		
		
		Season.SUMMER.printHours();
		Season.WINTER.printHours();
		Season.FALL.printHours();
		Season.SPRING.printHours();
		
		

	}

}
