package com.Project_Z;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	
	public Rectangle() {}
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	public double  Area(int width, int length){
		
		//Area of the Rectangle=width * length
		return width*length; 
		
	}
	
	public double Perimeter(int width, int length) {
		
		//Perimeter of the Circle=2(Width+length)
		
		return 2 * (width + length);
		
	}
	
	
	
	
}
