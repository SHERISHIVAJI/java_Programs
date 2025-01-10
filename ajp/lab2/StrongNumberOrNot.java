package ajp.lab2;
/*
Write a program to check whether a number is a Strong number or not. Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
*/

import java.util.Scanner;

class StrongNumberOrNot
{
	static int factorial(int num)
	{
		int fact=1;
		for(int itr=1;itr<=num;itr++)
			fact*=itr;
		return fact;
	}
	public static boolean isStrongOrNot(int num)
	{
		int originalNumber=num;
		int sumOfFactorial=0;
		while(num>0)
		{
			int digit=num%10;
			sumOfFactorial+=factorial(digit);
			num/=10;
		}
		return sumOfFactorial==originalNumber;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=in.nextInt();
		if(isStrongOrNot(number))
			System.out.print(number+" is a strong number.");
		else
			System.out.print(number+" is not a strong number.");
		in.close();
	}
}
