/*
Write a Java program that calculates the sum of all even numbers present in an
ArrayList of integers.
*/
package ajp.lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenElementsInArrayList {

	public static void main(String[] args) {
		//Creating an ArrayList of Integer type
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Creating a scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user how many numbers they want to input
        System.out.print("Enter the number of elements of ArrayList: ");
        int size = scanner.nextInt();
        
        // Taking user input for the elements of the ArrayList
        System.out.println("Enter " + size + " integers to insert into ArrayList:");
        for (int i = 0; i < size; i++) {
            int num = scanner.nextInt();
            numbers.add(num);  // Add each number to the ArrayList
        }
        
        // Creating a variable to store the sum of even numbers
        int sum = 0;
        
        // Loop through the ArrayList to find even numbers and sum them
        for (int number : numbers) {
            if (number % 2 == 0) {  // Check if the number is even
                sum += number;
            }
        }
        
        // Printing the result
        System.out.println("The sum of all even numbers is: " + sum);
        
		scanner.close();
	}

}
