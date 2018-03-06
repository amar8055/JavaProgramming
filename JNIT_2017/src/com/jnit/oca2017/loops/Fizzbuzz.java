package com.jnit.oca2017.loops;

//1 to 100
//3 = fizz
//5 = buzz
//3 and 5 = fizzbuzz
public class Fizzbuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println(i+"FizzBuzz");
			}else if(i % 3 == 0){
				System.out.println(i+"Fizz");
			}else if(i % 5 == 0){
				System.out.println(i+"Buzz");
			}else{
				System.out.println(i+"Not a multiple of 3 and 5");
			}
		}
		
		//print all characters of a string
		String s = "hello";
		for(int i=0; i<s.length();i++){
			System.out.println(s.charAt(i));
		}

	}

}
