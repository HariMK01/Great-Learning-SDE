package com.gl.week1.assignment;

public abstract class Shape {
	
	public String color;
	
	public double area, perimeter;
	
	public abstract void calcArea();
	
	public abstract void calcPerimeter();
	
	public abstract String displayDetails(Shape obj);
	
	
	

}
