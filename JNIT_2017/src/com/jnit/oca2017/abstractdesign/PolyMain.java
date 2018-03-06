package com.jnit.oca2017.abstractdesign;

import java.util.ArrayList;

public class PolyMain {
	//child -> child, parent(class, Interface)
	public static void main(String[] args) {
		Employee e = new Employee();
		Person p = new Employee();
		p.paySalary();

}
}