package com.jnit.oca2017.loops;

public class BreakContinueMain {

	public static void main(String[] args) {
		for(int i=0; i<10;i++){
			if(i == 7){
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Executing continue");

		for(int i=0; i<10;i++){
			if(i == 7){
				continue;
			}
			System.out.println(i);
		}	

	}

}
