package com.gl.week1.assignment;

public class Triangle extends Shape {

int height, base;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Triangle(int height, int base, String color) {
		super.color = color;
		this.height = height;
		this.base  = base;
	}



	@Override
	public void calcArea() {
	    area = 0.5 * height * base;
	}

	@Override
	public void calcPerimeter() {
		
		perimeter =  ((height+base)+Math.sqrt(height^2+base^2));
	}

	@Override
	public String displayDetails(Shape obj) {
		return "Its a Triangle with area: " + obj.area + "\n" + "perimeter: " + obj.perimeter +"\n" + "color: " + obj.color;
	}

}
