/*
 * WAP for ATM Application using Custom Exception to handle incorrect Pin Exception and  Insufficient fund Exceptions
 */

package ajp.lab8;

import java.util.Scanner;

//Custom Exception to handle incorrect Pin Exception
class IncorrectPinException extends Exception {

	public IncorrectPinException(String message) {
		super(message);
	}
}

//Custom Exception to handle Insufficient fund Exceptions
class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class ATMApplication {
	// Pre-set correct PIN
	private static final String CORRECT_PIN = "3963";
	// Initial balance
	private static double balance = 50000.00;

	// Method to validate PIN
	public static void validatePin(String enteredPin) throws IncorrectPinException {
		if (!enteredPin.equals(CORRECT_PIN)) {
			throw new IncorrectPinException("Incorrect Pin! please try again.");
		}
	}

	// Method to withdraw money
	public static void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds! You have only " + balance + " in your account.");
		} else {
			balance -= amount;
			System.out.println("Transaction successful! You withdrew " + amount + ". Your new balance is " + balance);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking the user to enter the PIN
		System.out.print("Enter your PIN: ");
		String enteredPin = input.nextLine();

		// Validate the PIN here
		try {
			validatePin(enteredPin);
			System.out.println("PIN validated sucessfully!");

			// Asking user to enter the withdrawal amount
			System.out.println("Enter the amount to withdraw: ");
			double amountToWithdraw = input.nextDouble();

			// Try to withdraw the amount
			try {
				withdraw(amountToWithdraw);
			} catch (InsufficientFundsException ife) {
				System.out.println(ife.getMessage());
			}
		} catch (IncorrectPinException ipe) {
			System.out.println(ipe.getMessage());
		} finally {
			input.close();
		}
	}

}
