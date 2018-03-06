package com.jnit.oca2017.interfacedemo;

public class Child extends Parent implements SchoolSchedule {

	public void play() {
		this.name = "Amelia";
		System.out.println(name + " is playing");
	}

	@Override
	public void getSchoolTimings() {
		System.out.println("Attend school from 8 am -4 pm");

	}

	public static void main(String[] args) {

		Child child = new Child();
		child.play();
	

		Parent parent = new Parent();
		parent.cook();

		SchoolSchedule sc = child;

		Object o = child;
		// o.play();//will not compile because the play method is not available
		// in the object reference
		// p.play();// will not compile because the play method is not available
		// in the parent reference

		sc.getSchoolTimings();
		
		parent = child;
		
		
		//*******************************CASTING****************************************
		
		if(parent instanceof Child){
			
			child =(Child) parent;
			
		}

	}

}
