package com.Project_Z;

public class Square extends Rectangle {

	protected int side;
	
	
	public Square() {
		
	}

	public Square(String color, int length, int width, int side) {
		super(color, length, width);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {	
		this.side = side;
	}

	@Override
	public void setLength(int length) {
		
		super.setLength(length);
	}

	@Override
	public void setWidth(int width) {
		
		super.setWidth(width);
	}
	
	public double  Area(int side){
		
		//Area of the square = A=a(power)2
		return Math.pow(side, 2); 
	
		
	}
	public double Perimeter(int side) {
		
		//Perimeter of the Square=4a
		
		return 4 * side;
		
	}
	
	
	
	
	
	
	
	
	
}
