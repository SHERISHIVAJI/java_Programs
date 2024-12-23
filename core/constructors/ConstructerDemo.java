package core.constructors;

public class ConstructerDemo 
{
	ConstructerDemo()
	{
		System.out.println("This is default constructer!!");
		System.out.println("This is executed with out calling it!!!");
	}
	ConstructerDemo(String name)
	{
		System.out.println("This is parameterised constructer!");
		System.out.println("The parameter passed is: "+name);
		System.out.println("This method also executed without calling!!");
	}
	public static void main(String[] args)
	{
		ConstructerDemo constructer=new ConstructerDemo();
		ConstructerDemo parameterisedCon=new ConstructerDemo("Shivaji");
	}
}
