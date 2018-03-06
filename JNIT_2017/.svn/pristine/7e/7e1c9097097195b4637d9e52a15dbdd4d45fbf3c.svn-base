package com.jnit.oca2017.objectmetthods;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Anusha",
				"6417 WHISKER BRUSH ROAD, FLOWER MOUND,TX", "123456789");
		e1.eType = EmployeeType.FULLTIME;
		Employee e2 = new Employee(2, "Anika",
				"6417 WHISKER BRUSH ROAD,FLOWER MOUND,TX", "123456789");
		e2.eType = EmployeeType.CONTRACT;

		// enums can be iterated just like an array using the values() method
		// which will return the array of enum constants

		for (EmployeeType et : EmployeeType.values()) {
			System.out.println(et);
		}
		
		calculateEmployeeBonus(e1);
		calculateEmployeeBonus(e2);
		
		
		e1.eType.printBonus();

	}

	
	
	
	
	public static void calculateEmployeeBonus(Employee e) {

		switch (e.eType) {

		case CONTRACT:
			System.out.println("Pay bonus by 10%");
			break;

		case FULLTIME:
			System.out.println("Pay bonus by 20%");
			break;

		case PARTTIME:
			System.out.println("No bonus");
			break;

		case VOLUNTARY:
			System.out.println("no bonus");
			break;

		}

	}

}
