package core.loopingStatements;

import java.util.Scanner;

public class PrintTable
{
	static void printTable(int num)
	{
		int itr=1;
		while(itr<=10)
		{
			System.out.println(num+" X "+itr+" = "+num*itr);
			itr++;
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=in.nextInt();
		printTable(num);
	}

}
