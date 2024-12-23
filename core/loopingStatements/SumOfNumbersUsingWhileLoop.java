package core.loopingStatements;

import java.util.Scanner;
public class SumOfNumbersUsingWhileLoop {
	static void calculateSum(int num)
	{
		int sum=0;
		System.out.print("The sum of numbers upto "+num+" is: ");
		while(num!=0)
		{
			sum+=num;
			num--;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=in.nextInt();
		calculateSum(num);
	}

}
