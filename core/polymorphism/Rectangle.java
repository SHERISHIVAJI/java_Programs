package core.polymorphism;

import java.util.Scanner;

public class Rectangle extends Circle 
{
	void area()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter length and width of rectangle: ");
		double length=in.nextDouble();
		double width=in.nextDouble();
		System.out.println("Area of rectangle is: "+length*width);
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.area();
		
		Circle c=new Circle();
		c.area();
	}
}
