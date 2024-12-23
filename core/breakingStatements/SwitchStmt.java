package core.breakingStatements;

/*
Branching statements:
=======================
Switch-case in Java program 

switch(value)
{
case value:
	//stmts
	break;
case value:
	//stmts
	break;
case value:
	//stmts
	break;
	.
	.
	.
case value:
	//stmts
	break;
default:
	//stmts
}	
*/
import java.util.Scanner;
public class SwitchStmt
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the day number: ");
		int day=in.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday");
				break;
			case 4:
				System.out.println("Today is Thursday");
				break;
			case 5:
				System.out.println("Today is Friday");
				break;
			case 6:
				System.out.println("Today is Saturday");
				break;
			case 7:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Enter a valid day!!\nTry again!!!");
		}
	}
}