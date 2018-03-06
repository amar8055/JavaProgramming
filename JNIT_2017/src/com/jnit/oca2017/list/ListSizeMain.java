package com.jnit.oca2017.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSizeMain {

	public static void main(String[] args) {
		// converting list to array
		List<String>alphabets = new ArrayList<>();
		alphabets.add("a");
		alphabets.add("b");
		alphabets.add("c");
		
		String[] newStringArray = alphabets.toArray(new String[alphabets.size()]);
		System.out.println(newStringArray.length);
		System.out.println(Arrays.toString(newStringArray));
		
		//converting array to list
		
		String[] array = { "red", "blue","green" };
		List<String>colors = Arrays.asList(array);
		colors.set(2,"White ");
		array[0] ="Yellow";
		//colors.add("Pink");
		System.out.println(Arrays.toString(array));	
		for (String string : colors) {
			System.out.println(string);
		}
		Collections.sort(colors);
		System.out.println(colors);
		
		//colors.remove("Yellow");// will create an exception as the list created is a fixed size
		
	}

}
