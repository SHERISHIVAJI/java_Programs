package core.polymorphism;

public class Calculator
{
	void add(int a,int b)
	{
		System.out.println("Sum of two integer numbers: "+a+" and "+b+"is :"+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("Sum of three integer numbers: "+a+","+b+" and "+c+"is :"+(a+b+c));
	}
	void add(double a,double b)
	{
		System.out.println("Sum of two floating point numbers: "+a+" and "+b+"is :"+(a+b));
	}
	void add(double a,double b,double c)
	{
		System.out.println("Sum of three floating point numbers: "+a+","+b+" and "+c+"is :"+(a+b+c));
	}
	
	void product(int a,int b)
	{
		System.out.println("\nProduct of two integer numbers: "+a+" and "+b+"is :"+(a*b));
	}
	void product(int a,int b,int c)
	{
		System.out.println("Product of three integer numbers: "+a+","+b+" and "+c+"is :"+(a*b*c));
	}
	void product(double a,double b)
	{
		System.out.println("Product of two integer numbers: "+a+" and "+b+"is :"+(a*b));
	}
	void product(double a,double b,double c)
	{
		System.out.println("Product of two integer numbers: "+a+","+b+" and "+c+"is :"+(a*b*c));
	}
	public  static void main(String args[])
	{
		Calculator c=new Calculator();
		c.add(10,20);
		c.add(30, 40, 70);
		c.add(24.567,953.00);
		c.add(12, 60, 80.0);
		
		c.product(3, 2);
		c.product(34, 50, 10);
		c.product(2.5, 239.53);
		c.product(3, 6, 1.7895);
	}
}
