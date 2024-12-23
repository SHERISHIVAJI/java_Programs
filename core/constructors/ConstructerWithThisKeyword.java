package core.constructors;

class Box
{
	double width,height,depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	double volume()
	{
		return width*height*depth;
	}
}
public class ConstructerWithThisKeyword
{
	public static void main(String[] args)
	{
		Box box1=new Box(10,15,20);
		System.out.println("The volume is: "+box1.volume());
		
		Box box2=new Box(2,3,4);
		System.out.println("The volume is: "+box2.volume());
	}
}
