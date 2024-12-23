package core.loopingStatements;
import java.util.Scanner;
public class FibonacciSeriesUsingWhileLoop 
{
	static void printFibonacciSeries(int limit)
	{
		int previousTerm1=0,previousTerm2=1,itr=3,nextTerm;
		System.out.print("The fibonacci series with limit upto "+limit+" terms is: \n"+previousTerm1+"\t"+previousTerm2);
		while(itr<=limit)
		{
			nextTerm=previousTerm1+previousTerm2;
			System.out.print("\t"+nextTerm);
			previousTerm1=previousTerm2;
			previousTerm2=nextTerm;
			itr++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the limit to print fibonacci serie: ");
		int limit=input.nextInt();
		printFibonacciSeries(limit);
	}
}
