package com.jnit.oca2017.objectmetthods;

//All enums implicitly extend java.lang.Enum, SO THEY CANNOT EXTEND ANY OTHER CLASSES
//An enum can be declared outside or inside a class, but NOT in a method
//Enum constants are implicitly static and final
//enums can be used in switch case statements
public enum EmployeeType {

	// CONTRACT, FULLTIME, PARTTIME, VOLUNTARY;

	CONTRACT(10.0), FULLTIME(20.0), PARTTIME(0.0), VOLUNTARY(0.0);

	double bonus;

	private EmployeeType(double bonus) {

		this.bonus = bonus;

	}

	public void printBonus() {
		System.out.println("pay bonus by" + this.bonus + "%");
	}

	// public abstract void printBonus();
}
