package core.variablesAndMethods;

/*Write a program to calculate the area and perimeter of rectangle and circle*/

class Rectangle
{
	int length,width;
	void areaOfRectangle()
	{
		double area=length*width;
		System.out.println("\nArea of rectangle is = "+area);
	}
	void perimeterOfRectangle()
	{
		double perimeter=2*(length+width);
		System.out.println("Perimeter of rectangle is = "+perimeter);
	}
}

class Circle
{
	int radius;
	void areaOfCircle()
	{
		double area=3.14*radius*radius;
		System.out.println("\nArea of circle is = "+area);
	}
	void perimeterOfCircle()
	{
		double perimeter=2*3.14*radius;
		System.out.println("Perimeter of circle is = "+perimeter);
	}
}

public class Shapes
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.length=5;
		r.width=3;
		r.areaOfRectangle();
		r.perimeterOfRectangle();

		Circle c=new Circle();
		c.radius=7;
		c.areaOfCircle();
		c.perimeterOfCircle();
	}
}

