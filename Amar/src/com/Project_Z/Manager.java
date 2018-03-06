package com.Project_Z;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employeehike {

		private int bonus;
		

	public int getBonus() {
			return bonus;
		}

		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		
		
	@Override
		public String toString() {
			return "Manager [bonus=" + bonus + ", getSalary()=" + getSalary() + "]";
		}

	public Manager(String employeeName, int salary, int joiningDate) {
	
		super();
		this.employeeName=employeeName;
		this.salary=salary;
		this.joiningDate=joiningDate;
		
	}

	public static void main(String[] args) {
		
		List<Employeehike>Emphike = new ArrayList<>();
		Employeehike mg = new Manager("jane",50000,10-22-2015);
		Employeehike mg1 = new Manager("jack", 30000, 10-10-2000);
		Employeehike mg2 = new Manager("alan", 40000, 9-9-1999);
		Employeehike mg3 = new Manager("ravi", 10000, 5-5-2004);
		Employeehike mg4 = new Manager("amelia",50000, 9-7-1995);
		
		List<Manager>mng = new ArrayList<>();
		Manager manager = new Manager("john", 60000, 6-3-1997);
		Manager manager1 = new Manager("olivia",65000, 8-7-2012);
		
		Emphike.add(mg);
		Emphike.add(mg1);
		Emphike.add(mg2);
		Emphike.add(mg3);
		Emphike.add(mg4);
		
		mng.add(manager);
		mng.add(manager1);
	
		
		
	for (Employeehike employeehike : Emphike) {
		System.out.println(employeehike);
	}
	
	for (Manager manager2 : mng) {
		
		System.out.println(manager2);
	}

	}
	
	

}
