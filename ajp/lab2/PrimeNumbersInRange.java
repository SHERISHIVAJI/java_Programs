package ajp.lab2;
/*
Write a Program to print all prime numbers in the given range.( i.e.  Printing the prime numbers with in the given range)
*/

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void printPrimeNumbersInRange(int start, int end) {
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		for (int i = start; i <= end; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the starting number of the range: ");
		int start = scanner.nextInt();
		System.out.print("Enter the ending number of the range: ");
		int end = scanner.nextInt();
		printPrimeNumbersInRange(start, end);
		scanner.close();
	}
}
