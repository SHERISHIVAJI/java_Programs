package core.loopingStatements;

import java.util.Scanner;
public class PrimeNumbersInRange 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the range value: ");
		int range=in.nextInt();
		System.out.println("The prime numbers upto "+range+" are: ");
		for(int num=2;num<=range;num++)
		{
			boolean status=false;
			for(int itr=2;itr<=num/2;itr++)
				if(num%itr==0)
				{
					status=true;
					break;
				}	
			if(!status)
			System.out.print(num+" ");
		}
	}
}