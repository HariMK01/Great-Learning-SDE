package com.gl.week1.assignment;

public class Circle extends Shape {

	int radius;


	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Circle(int radius, String color) {
		super.color = color;
		this.radius = radius;
	}



	@Override
	public void calcArea() {
	    area = Math.PI * (radius * radius);
	}

	@Override
	public void calcPerimeter() {
		
		perimeter = 2 * Math.PI * radius;
	}

	@Override
	public String displayDetails(Shape obj) {
		return "Its a Circle with area: " + obj.area + "\n" + "perimeter: " + obj.perimeter +"\n" + "color: " + obj.color;
	}

}
