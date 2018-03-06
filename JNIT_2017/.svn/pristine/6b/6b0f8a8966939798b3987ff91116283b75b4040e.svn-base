package com.jnit.oca2017.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Conversion {
	// list to an array(list.toarray) and array to a list(Arrays.asList(array))
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		List<Integer> numbersList = new ArrayList<>();
		for (int n : numbers) {
			numbersList.add(n);
		}

		List<String> colorsList = new ArrayList<>();
		colorsList.add("Red");
		colorsList.add("Blue");
		colorsList.add("Pink");
		colorsList.add("Black");

		String[] colors = colorsList.toArray(new String[4]);
		System.out.println(colors.length);
		System.out.println(Arrays.toString(colors));
		
		System.out.println(Arrays.toString(colors));

		List<String> stringList = Arrays.asList(colors);
		colors[0] ="Black";
		System.out.println(stringList);
		
		
		 //System.out.println(stringList.remove(0));

		List<Integer> numbersList1 = Arrays.asList(1, 2, 3, 4);
		List<Boolean> activesList = Arrays.asList(true, false, true);

	}

}
