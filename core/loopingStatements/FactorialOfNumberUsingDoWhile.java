package core.loopingStatements;

import java.util.Scanner;

public class FactorialOfNumberUsingDoWhile 
{
	static int calculateFact(int num)
	{
		int res=1;
		do
		{
			res*=num;
			num--;
		}while(num!=0);
		return res;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int number=input.nextInt();
		int result=calculateFact(number);
		System.out.println("The factorial of "+number+" is: "+result);
		input.close();
	}
}