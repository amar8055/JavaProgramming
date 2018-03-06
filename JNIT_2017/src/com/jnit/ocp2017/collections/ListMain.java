package com.jnit.ocp2017.collections;

import java.util.ArrayList;
import java.util.List;

//Collection - I
//List extends Collection -
//ArrayList, LinkedList, Vector(thread safe, 2 times of its current size)
//Set extends Collection
//Queue extends Collection
//Map
public class ListMain {
	// starting element is at index 0
	// ordered collection
	// accepts duplicates
	// we are doing more retrievals
	// re-indexing happens when we perform removals
	// add,remove,contains,clear,set,get(i),size()
	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(5);// programming to interfaces

		colors.add("blue");// 0
		colors.add("red");// 1
		colors.add(2, "black");
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.isEmpty());

		System.out.println(colors.remove(0));
		System.out.println(colors.set(0, "Yellow"));// returns an element that
		colors.add("Yellow");										// is replaced
		System.out.println(colors.contains("Yellow"));
		System.out.println(colors.indexOf("Yellow"));
		System.out.println(colors.lastIndexOf("Yellow"));
		System.out.println(colors);

	}

}
