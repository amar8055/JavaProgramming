package com.jnit.oca2017.staticdemo;

//static -> only one per class(not one per object)
//all the objects will share one single copy of x
//static methods
//static initializers ->set values for your static variables,they gets executed first

public class Player {

	String name;
	int age;
	char gender;
	static int counter;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Player() {
		//counter = counter + 1;
		this.name ="Hasini";
		this.age =25;
		this.gender = 'f';

	}

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Player(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

}
