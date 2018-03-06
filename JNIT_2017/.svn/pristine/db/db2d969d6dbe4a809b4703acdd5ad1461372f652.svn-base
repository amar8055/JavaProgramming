package com.jnit.session4.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Conversion {
    //list to an array(list.toarray) and array to a list(Arrays.asList(array))
	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		List<Integer>numbersList = new ArrayList<>();
		for(int n : numbers){
			numbersList.add(n);
		}
		
		String[]colors = {"a","b","c"};
		List<String>stringList = Arrays.asList(colors);
		///boolean[]actives = {true,false, true};
		//List<Boolean>activesList = Arrays.asList(actives);
		List<Integer>numbersList1 = Arrays.asList(1,2,3,4);
		List<Boolean>activesList = Arrays.asList(true,false,true);
		List<String>models = Arrays.asList("toyota","honda");
		String[]modelsarr = models.toArray(new String[models.size()]);
		for (String string : modelsarr) {
			System.out.println(string);
		}
		System.out.println("----------");
		Collections.sort(models, Collections.reverseOrder());
		for(String s : models){
			System.out.println(s);
		}
		
		
	}

}
