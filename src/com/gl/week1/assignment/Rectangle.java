package com.gl.week1.assignment;

public class Rectangle extends Shape {
	
	int len, bth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Rectangle(int len, int bth, String color) {
		super.color = color;
		this.len = len;
		this.bth = bth;
	}



	@Override
	public void calcArea() {
	    area = len*bth;
	}

	@Override
	public void calcPerimeter() {
		
		perimeter = 2 * (len + bth);
	}

	@Override
	public String displayDetails(Shape obj) {
		return "Its a Rectangle with area: " + obj.area + "\n" + "perimeter: " + obj.perimeter +"\n" +  "color: " + obj.color;
	}
	
}
