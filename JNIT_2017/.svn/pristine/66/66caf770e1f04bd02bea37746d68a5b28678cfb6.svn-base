package com.jnit.ocp2017.generics;

import java.util.ArrayList;
import java.util.List;

public class LegacyCode {
	
	public static void main(String[] args) {
		List<String>someList = new ArrayList<String>();
		someList.add("hello");
		addSomeThingToList(someList);
		//String x = someList.get(1);
		System.out.println(someList);
		List rawList = new ArrayList();
		rawList.add(new StringBuffer("hello"));
		doSomething(rawList);
		
	}
	
	public static void addSomeThingToList(List list){
		list.add(100);
	}
	
	public static void doSomething(List<Toy>someList){
		for (Toy string : someList) {
			System.out.println(string);
		}
	}
}
