package com.gl.week1.assignment;

public class Square extends Shape {

	int len;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Square(int len, String color) {
		super.color = color;
		this.len = len;
	}



	@Override
	public void calcArea() {
	    area = len*len;
	}

	@Override
	public void calcPerimeter() {
		
		perimeter = 4 * len;
	}

	@Override
	public String displayDetails(Shape obj) {
		return "Its a Square with area: " + obj.area + "\n" + "perimeter: " + obj.perimeter +"\n" + "color: " + obj.color;
	}

}
