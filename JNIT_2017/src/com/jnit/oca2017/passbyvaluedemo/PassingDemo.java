package com.jnit.oca2017.passbyvaluedemo;

import com.jnit.oca2017.staticdemo.Player;

public class PassingDemo {
	
	static int x = 50;

	public static void main(String[] args) {

		String name = "Zoey";
		StringBuilder sb = new StringBuilder();
		changeName(sb);
		System.out.println(sb);
		
		
		
//		Player player = new Player();
//
//		add();
//		changeName(name);
//		player.setName("John");
//		player.setGender('M');
//		player.setAge(25);
//
//		changePlayerDetails(player);
//
//		System.out.println(x);
//		System.out.println(name);
//		System.out.println(player.getName());
//		System.out.println(player.getAge());
//		System.out.println(player.getGender());

	}

	public static void add() {
		x = x + 10;
	}

	public static void changeName(String name) {
		name = "Taffy";

	}
	
	
	public static void changeName(StringBuilder sb) {
		sb.append("Taffy");
		sb.append("zoey");

	}

	public static void changePlayerDetails(Player player) {

		player.setName("Jane");
		player.setGender('F');
		player.setAge(29);

	}

}
