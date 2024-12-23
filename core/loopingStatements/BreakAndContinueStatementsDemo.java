package core.loopingStatements;

import java.util.Scanner;

public class BreakAndContinueStatementsDemo 
{
	//it will print the numbers which are not the multiples of 5
	static void printNumberNotMultipleOf5(int range)
	{
		System.out.println("The numbers not multiples of 5 are: ");
		for(int itr=0;itr<=range;itr++)
		{
			if(itr%5==0)
				continue;
			System.out.print(itr+" ");
		}
		System.out.println();
	}
	//it will print the half numbers in a range
	static void printHalfRange(int range)
	{
		System.out.println("The numbers upto half range are: ");
		for(int itr=1;itr<=range;itr++)
		{
			System.out.print(itr+" ");
			if(itr==range/2)
				break;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a range: ");
		int range=in.nextInt();
		printNumberNotMultipleOf5(range);
		printHalfRange(range);
		in.close();
	}
}
