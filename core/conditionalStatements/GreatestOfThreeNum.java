package core.conditionalStatements;

//Greatest of 3 numbers

import java.util.Scanner;
public class GreatestOfThreeNum
{
	void getMaxNum(int x,int y,int z)
	{
		if(x==y && x==z)
			System.out.println("Both the values are equal");
		else if(x>y)
		{
			if(x>z)
				System.out.print(x+"(x) is greater the "+y+"(y) and "+z+"(z)");
			else
				System.out.print(z+"(z) is greater the "+x+"(x) and "+y+"(y)");
		}
		else
			System.out.println(y+"(y) is greater the "+x+"(x) and "+z+"(z)");
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the three values: ");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		GreatestOfThreeNum gots=new GreatestOfThreeNum();
		gots.getMaxNum(num1,num2,num3);
	}
}
