package com.jnit.ocp2017.resourcebundle.classes;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

import com.jnit.oca2017.accessmodifier1.Employee;



public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int i =1;
		while(i<=10){
			System.out.println(rnd.nextInt(10));
			i++;
		}
		
		ResourceBundle rs = ResourceBundle.getBundle("com.jnit.ocp2017.resourcebundle.classes.Zoo", Locale.US);
		Employee emp = (Employee)rs.getObject("emp");
		System.out.println(emp);
	}

}
