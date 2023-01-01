package com.gl.week1.assignment;

public class Main {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(4, 3, "Red");
		rc.calcArea();
		rc.calcPerimeter();
		
		Square sq = new Square(4, "Green");
		sq.calcArea();
		sq.calcPerimeter();
		
		Circle cr = new Circle(4, "Yellow");
		cr.calcArea();
		cr.calcPerimeter();
		
		Triangle tr = new Triangle(4, 3, "Blue");
		tr.calcArea();
		tr.calcPerimeter();
		
		
		System.out.println(rc.displayDetails(rc));
		System.out.println("**********");
		System.out.println(sq.displayDetails(sq));
		System.out.println("**********");
		System.out.println(cr.displayDetails(cr));
		System.out.println("**********");
		System.out.println(tr.displayDetails(tr));
	}
}
