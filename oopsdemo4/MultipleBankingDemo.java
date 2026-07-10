package oopsdemo4;

import java.util.Scanner;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :10:44:03 am
 *email :ridhima.gadalay@gmail.com
 *Java Program to demonstrate Multiple Inheritance using Interfaces & Classes in Java
 * demonstrating Banking System with multiple banks implementing a common interface.
 */
public class MultipleBankingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input number of customers
		System.out.print("Enter Number of Customers: ");
		int n = sc.nextInt();

		// Process each customer
		for (int i = 1; i <= n; i++) {

			System.out.println("\n========== Customer " + i + " ==========");

			System.out.print("Enter Account Number: ");
			int accountNumber = sc.nextInt();
			sc.nextLine(); // Consume newline

			System.out.print("Enter Account Holder Name: ");
			String accountHolder = sc.nextLine();

			System.out.print("Enter Mobile Number: ");
			long mobileNumber = sc.nextLong();
			sc.nextLine();

			System.out.print("Enter Account Type (Savings/Current): ");
			String accountType = sc.nextLine();

			System.out.print("Enter Initial Balance: ");
			double balance = sc.nextDouble();

			// Create BankAccount object
			BankAccount account = new BankAccount(
					accountNumber,
					accountHolder,
					mobileNumber,
					accountType,
					balance);

			// Display account details
			account.displayAccountDetails();

			// Deposit
			System.out.print("\nEnter Deposit Amount: ");
			double depositAmount = sc.nextDouble();
			account.deposit(depositAmount);

			// Withdraw
			System.out.print("Enter Withdraw Amount: ");
			double withdrawAmount = sc.nextDouble();
			account.withdraw(withdrawAmount);

			sc.nextLine(); // Consume newline

			// Transfer Money
			System.out.print("Enter Receiver Name: ");
			String receiver = sc.nextLine();

			System.out.print("Enter Transfer Amount: ");
			double transferAmount = sc.nextDouble();
			account.transferMoney(transferAmount, receiver);

			// Display final balance
			account.checkBalance();

			System.out.println("\n========================================");
		}

		System.out.println("\nAll customer transactions completed successfully.");

		sc.close();

	}

}
