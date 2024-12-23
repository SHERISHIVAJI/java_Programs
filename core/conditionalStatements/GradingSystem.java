package core.conditionalStatements;

//conditional statementds--multiple conditions

import java.util.Scanner;
class GradingSystem
{
	void calculateGrade(int marks)
	{
		if(marks<35)
			System.out.print("Your failed in the examination");
		else if(marks>=35 && marks<50)
			System.out.print("Your grade is: C");
		else if(marks>=50 && marks<60)
			System.out.print("Your grade is: B");
		else if(marks>=60 && marks<70)
			System.out.print("Your grade is: B+");
		else if(marks>=70 && marks<80)
			System.out.print("Your grade is: A");
		else if(marks>=80 && marks<90)
			System.out.print("Your grade is: A+");
		else if(marks>=90 && marks<=100)
			System.out.print("Your grade is: O");
		else
			System.out.print("Enter valid marks!!!");		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your marks here: ");
		int marks=in.nextInt();
		GradingSystem gs=new GradingSystem();
		gs.calculateGrade(marks);
	}
}