package core.loopingStatements;

import java.util.Scanner;

public class NumberIsPalindromeOrNOt
{
	static boolean checkPalindromeOrNot(int num)
	{
		int temp=num;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;			
		}
		if(rev==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to test palindrom or not: ");
		int number=input.nextInt();
		if(checkPalindromeOrNot(number))
			System.out.print(number+" is a palindrome number");
		else
			System.out.print(number+" is not a palindrome number");
	}
}
