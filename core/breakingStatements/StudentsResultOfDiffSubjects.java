package core.breakingStatements;

import java.util.Scanner;

public class StudentsResultOfDiffSubjects
{
	char grade;
	void calculateGrade()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your subject wise marks........");
		System.out.print("Enter your subject1 marks(<=100): ");
		int sub1=in.nextInt();
		System.out.print("Enter your subject2 marks(<=100): ");
		int sub2=in.nextInt();
		System.out.print("Enter your subject3 marks(<=100): ");
		int sub3=in.nextInt();
		System.out.print("Enter your subject1 marks(<=100): ");
		int sub4=in.nextInt();
		System.out.print("Enter your subject1 marks(<=100): ");
		int sub5=in.nextInt();
		if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35)
		{
			int total=sub1+sub2+sub3+sub4+sub5;
			float avg=total/5;
			if(avg>=35 && avg<50)
				grade='C';
			else if(avg>=50 && avg<70)
				grade='B';
			else if(avg>=70 && avg<90)
				grade='9';
			else if(avg>=80 && avg<=100)
				grade='O';
			System.out.println("Grade is calculated");
		}
		else
			System.out.println("Student failed in the exams");
	}
	void getResult()
	{
		switch(grade)
		{
			case 'O':
				System.out.println("Student grade is : "+grade);
				break;
			case 'A':
				System.out.println("Student grade is : "+grade);
				break;
			case 'B':
				System.out.println("Student grade is : "+grade);
				break;
			case 'C':
				System.out.println("Student grade is : "+grade);
				break;
			default:
				System.out.println("Grade mis-matched!!");
		}
	}				
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		StudentsResultOfDiffSubjects stdres=new StudentsResultOfDiffSubjects();
		stdres.calculateGrade();
		System.out.print("Like to know your grade (y/n): ");
		char flag=in.next().charAt(0);
		if(flag=='y')
		{
			stdres.getResult();
			System.out.print("Thank yo...!!");
		}
		else
			System.out.print("Thank you...!!");
	}
}

