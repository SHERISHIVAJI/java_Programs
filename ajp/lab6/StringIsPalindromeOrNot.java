package ajp.lab6;

import java.util.Scanner;

public class StringIsPalindromeOrNot {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		//take input string from user
		System.out.print("Enter a string to check palindrome or not: ");
		String str = input.next();
		
		// Function call to check if the string is a palindrome.
		if (isPalindrome(str))
			System.out.println(str + " is a palindrome string.");
		else
			System.out.println(str + " is not a palindrome string.");
		input.close();
	}

	// Function to check if a string is a palindrome.
	public static boolean isPalindrome(String str) {
		
		// Converting the string to lowercase for case-insensitive comparison.
		str = str.toLowerCase();
		
		// Initialize pointers for the start and end of the string.
		int start = 0;
		int end = str.length() - 1;
		
		// Check characters from start and end moving towards the middle.
		while (start < end) {
			if (str.charAt(start) != str.charAt(end))
				return false; // Not a palindrome.
			start++;
			end--;
		}
		return true; // It's a palindrome.
	}
}
