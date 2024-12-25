package ajp.lab;

import java.util.Scanner;

/*
 *  Create a Bank class and declare an instance variable named amount of 
 *  type double.Create parameterized constructor to initialize variable
 *  “amount” with value 10000.Create two methods withdraw(double 
 *   withdrawalAmount) and deposit(double depositAmount).Calculate 
 *   withdrawal based on some condition (using ternary operator) like If 
 *   amount is sufficient then “withdraw successful” message will be 
 *   printed on the console and amount should be updated after withdraw. 
 *   Later on, deposit 5000 in the account balance.At the end display 
 *   total balance on the console.
 */
public class Bank
{
	double amount;//instance variable
	
	//parameterized constructor to initialize variable "amount"
	public Bank(double amount) 
	{
		this.amount=amount;
	}
	
	//withdraw amount here
	void withdraw(double withdrawalAmount)
	{
		boolean flag;
		flag=(amount>=withdrawalAmount) ? true: false;
		if(flag)
		{
			System.out.println("Withdraw successful");
			amount-=withdrawalAmount;
		}
		else
			System.out.println("Insufficient amount!");	
	}
	
	//deposit amount here
	void deposit(double depositAmount)
	{
		amount+=depositAmount;
		System.out.println("Balance amount: "+amount);
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Bank bank=new Bank(1000);
		System.out.print("Enter amount to withdraw: ");
		double amountToWithdraw=input.nextDouble();
		bank.withdraw(amountToWithdraw);
		System.out.print("Enter amount to diposit: ");
		double amountToDeposit=input.nextDouble();
		bank.deposit(amountToDeposit);
	}
}



