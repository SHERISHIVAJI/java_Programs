package ajp.lab3;
/*
Write a program to check leap year using if else. How to check whether a given year is a leap year or not. [Hint:Take an input of any number. Store it in some variable say year. If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year. Or if a year is exactly divisible by 400 then it is a leap year.]
*/

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		
		//check the leap year condition here
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
		scanner.close();
	}
}
