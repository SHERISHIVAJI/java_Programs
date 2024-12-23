package core.loopingStatements;

import java.util.Scanner;

public class NumbersDivisibleBy3 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int range=input.nextInt();
		System.out.println("The numbers divisible by 3 in range "+range+" are: ");
		for(int itr=0;itr<=range;itr++)
			if(itr%3==0)
				System.out.print(itr+"\n");
		input.close();
	}
}
