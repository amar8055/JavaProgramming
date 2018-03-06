package com.jnit.ocp2017.generics;

public class Toy  {

	String type;
	String color;

	public Toy(String tyoe, String color) {
		super();
		this.type = tyoe;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String tyoe) {
		this.type = tyoe;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Toy [type=" + type + ", color=" + color + "]";
	}

}
