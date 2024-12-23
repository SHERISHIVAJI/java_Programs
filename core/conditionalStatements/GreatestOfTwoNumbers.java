package core.conditionalStatements;

//Conditional statements

import java.util.Scanner;
public class GreatestOfTwoNumbers
{
	void checkGreatestHere(int x,int y)
	{
		if(x>y)
			System.out.print(x+" is greater then "+y);
		else
			System.out.print(y+" is greater then "+x);
	}
	public static void main(String args[])
	{
		int num1,num2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values: ");
		num1=in.nextInt();
		num2=in.nextInt();
		GreatestOfTwoNumbers obj=new GreatestOfTwoNumbers();
		obj.checkGreatestHere(num1,num2);
	}
}