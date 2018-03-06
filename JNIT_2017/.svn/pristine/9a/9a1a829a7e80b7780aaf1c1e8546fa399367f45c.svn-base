package com.jnit.oca2017.enums;

//cannot extend an enum but can impleem
//cannot instantiate enum BECAUSE OF THE PRIVATE CONSTRUCTOR
//
public enum Season {

	WINTER("Low") {
		public void printHours() {
			System.out.println("short hours");
		}
	},
	SPRING("Medium") {
		
		public void printHours() {
			System.out.println("short hours");
		}

	},
	SUMMER("High"),
	FALL("Medium") ;

	private String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
	
	public  void printHours(){
		System.out.println("DEFAULT hours");
		
	}

}
