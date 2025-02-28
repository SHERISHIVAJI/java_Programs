/*
 * Write a Program using String Tokenizer print the number of tokens, and reverse each token in its same place.
 */

package ajp.lab7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for input string
		System.out.print("Enter the input string: ");
		String str = input.nextLine();

		// Create a StringTokenizer object to split the input string by spaces
		StringTokenizer tokenizer = new StringTokenizer(str);

		// Count the number of tokens in the input string
		int tokenCount = tokenizer.countTokens();
		System.out.println("Number of tokens: " + tokenCount);

		// Recreate the tokenizer to reverse each token
		tokenizer = new StringTokenizer(str);

		// Print the reversed tokens in the same order
		System.out.println("Reversed tokens:");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			String reversedToken = new StringBuilder(token).reverse().toString();
			System.out.print(reversedToken + " ");
		}
	}
}
