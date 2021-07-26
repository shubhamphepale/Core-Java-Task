package com.neosoft.basic;


class Shape1 {
	
	void Area() {
		System.out.println("Calculate the area of shape");
	}
	
	void Draw() {
		System.out.println("Draw the Shape with it coordinates");
	}
}
class Circle extends Shape1{
	int radius=5;
	double area;
	void Area() {
		area=3.14*(radius*radius);
		System.out.println("Calculated the area of Circle ="+area);
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with radius "+radius);
	}
}
class Triangle extends Shape1{
	int height=20;
	int base=10;
	int area;
	void Area() {
		area=(height*base)/2;
		System.out.println("Calculated the area of Triangle ="+area);
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with Height "+height+" and Base "+base);
	}
}
class Square extends Shape1{
	int side=5;
	int area;
	void Area() {
		area=(side*side);
		System.out.println("Calculated the area of Square ="+area);
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with Side "+side);
	}
}
public class Shape{  
	public static void main(String args[]){ 
		
		Shape1 s1;
		s1 = new Circle();
		s1.Area();
		s1.Draw();
		s1 = new Triangle();
		s1.Area();
		s1.Draw();
		s1 = new Square();
		s1.Area();
		s1.Draw();
	}  
}  
