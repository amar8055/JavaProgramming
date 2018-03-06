package com.jnit.ocp2017.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMain {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("hello","bye","good night");
		stream.map(a -> a.toUpperCase()).forEach(System.out::println);
		System.out.println();
		Map<String,String>map = new HashMap<>();
		map.put("robert","qa");
		map.put("tom","developer");
		map.put("mike","Tech lead");
		map.put("Charlie", "developer");
		map.put("Jim", "Project Mananger");
//		for(Map.Entry<String, String>e: map.entrySet()){
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		List<String>keys = map.entrySet()
				.stream().filter(a -> a.getValue().equals("developer"))
				.map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(keys);
		
	}

}
