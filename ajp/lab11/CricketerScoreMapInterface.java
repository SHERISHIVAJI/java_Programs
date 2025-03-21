/*
write a program in Java to create a Map Interface where we
can store the cricketer name in it along with his scores and 
search for the batsman name and display his score.
*/
package ajp.lab11;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CricketerScoreMapInterface {

	public static void main(String[] args) {
		// Creating a Map to store cricketer names and their scores
		Map<String, Integer> cricketerScores = new HashMap<>();

		Scanner scanner = new Scanner(System.in);

		// Asking how many cricketer scores the user wants to enter
		System.out.print("Enter the number of cricketers you want to add: ");
		int numOfPlayers = scanner.nextInt();
		scanner.nextLine();

		// Taking user input for cricketer names and scores
		for (int i = 0; i < numOfPlayers; i++) {
			System.out.print("Enter cricketer name: ");
			String cricketerName = scanner.nextLine();

			System.out.print("Enter score for " + cricketerName + ": ");
			int score = scanner.nextInt();
			scanner.nextLine(); // Consume newline left by nextInt()

			// Storing the cricketer and their score in the Map
			cricketerScores.put(cricketerName, score);

		}
		
		// Asking the user to enter a batsman's name to search for their score
		System.out.print("Enter the batsman's name to search for their score: ");
		String searchName = scanner.nextLine();

		// Check if the batsman exists and display the score
		if (cricketerScores.containsKey(searchName)) {
			int score = cricketerScores.get(searchName);
			System.out.println(searchName + "'s score is: " + score);
		} else {
			System.out.println("Batsman not found in the records.");
		}
		
		scanner.close();
	}

}
