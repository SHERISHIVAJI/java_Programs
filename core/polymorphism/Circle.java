package core.polymorphism;

import java.util.Scanner;

public class Circle 
{
	void area()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius=in.nextDouble();
		System.out.println("Area of circle is: "+3.14*radius*radius);
	}
}
