/*
 * WAP for handling Divide By Zero Exception
 */

package ajp.lab8;

import java.util.Scanner;

public class DivideByZeroExceptionExample {

	static void calculateDivision(int dividend, int divisor) {
		try {
			int result = dividend / divisor;
			System.out.println("The result of " + dividend + "/" + divisor + " is " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.err.println("Error: connot divide by zero!");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Taking input for dividend and divisor
		System.out.print("Enter the dividend: ");
		int dividend = input.nextInt();
		
		System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        
        // Attempting division
        calculateDivision(dividend, divisor);
        input.close();
	}

}
