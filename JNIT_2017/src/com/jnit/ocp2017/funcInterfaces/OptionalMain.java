package com.jnit.ocp2017.funcInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//90,90 -> 90
// ->0
//orElse(T t),orElseThrow(Supplier<T>t )//throw an exception
//orElseGet(Supplier<T>t)
public class OptionalMain {

	public static Integer average(int... marks){
		if(marks.length == 0){
			return null;
		}
		int total = 0;
		for(int s : marks){
			total +=s;
		}
		return total/marks.length;
	}

	public static Optional<Double> averageWithOptional(int... marks){
		if(marks.length == 0){
			return Optional.empty();
		}
		int total = 0;
		for(int s : marks){
			total +=s;
		}
		return Optional.of((double)total/marks.length);
	}

	public static void main(String[] args) {
		int[] x = {90,90};
		int[] x1 = {};
		Optional<Double>o = averageWithOptional(x);
		if(o.isPresent()){
			Double avg = o.get();
			System.out.println(avg);
		}
		Optional<Double>emptyOptional = averageWithOptional(x1);
		if(emptyOptional.isPresent()){
			
			Double avg = emptyOptional.get();
			System.out.println("Empty optional");
		}
		
		o.ifPresent((t) -> System.out.println(t));
		emptyOptional.ifPresent((t) -> System.out.println(t));
		
		System.out.println(emptyOptional.orElse(0.0));
		System.out.println(emptyOptional.orElseGet(()-> 0.0));
		emptyOptional.orElseThrow(()-> {throw new IllegalStateException("somehting went wrong");});
		
	
	}

}
