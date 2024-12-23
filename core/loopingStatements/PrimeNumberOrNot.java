package core.loopingStatements;

import java.util.Scanner;

public class PrimeNumberOrNot
{
	static void checkPrimeOrNot(int number)
	{
		boolean status=false;
		for(int itr=2;itr<=number/2;itr++)
			if(number%itr==0)
			{
				status=true;
				break;
			}
		if(status)
			System.out.println(number+" is not a prime number");
		else
			System.out.println(number+" is a prime number");
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		checkPrimeOrNot(number);		
	}	
}