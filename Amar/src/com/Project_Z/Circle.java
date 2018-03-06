package com.Project_Z;

	
public class Circle extends Shape {

	private int radius;
	
	
	public Circle() {
	}	

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double  Area(int radius){
	
		//Area of the Circle=pi*r2
		return Math.PI*Math.pow(radius, 2); 
		
	}
	
	public double Perimeter(int radius) {
		
		//Perimeter of the Circle=2*pi*r
		
		return 2 * Math.PI * radius;
		
	}


	
	}
