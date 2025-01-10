package ajp.lab1;

import java.util.Scanner;

/*
 *  Write a program to input two numbers and find the maximum between two
 *  numbers using the conditional/ternary operator.
 */
public class MaximumOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		System.out.print("Enter any two numbers: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		//check the maximum here.
		boolean flag= (num1>num2) ? true: false;
		if(flag)
			System.out.println(num1+" is maximum");
		else
			System.out.println(num2+" is maximum");
		input.close();
	}
}
