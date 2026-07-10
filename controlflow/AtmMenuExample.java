package controlflow;

import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :10:01:31 am
 *email :ridhima.gadalay@gmail.com
 *Java Program to demonstrate a simple ATM Menu using control flow statements.
 */
public class AtmMenuExample {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		double balance = 5000.0;

		System.out.println("=== ATM Menu ===");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("5. Credit Card Services ");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Your balance is: " + balance);
			break;

		case 2:
			System.out.print("Enter amount to deposit: ");
			double depositAmt = sc.nextDouble();
			balance += depositAmt;
			System.out.println("Deposit successful. New balance: " + balance);
			break;

		case 3:
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmt = sc.nextDouble();
			if (withdrawAmt > balance) {
				System.out.println("Insufficient balance!");
			} else {
				balance -= withdrawAmt;
				System.out.println("Withdrawal successful. New balance: " + balance);
			}
			break;

		case 4:
			System.out.println("Thank you for using our ATM. Goodbye!");
			break;
			
		/*case 4:
		 * case 5;
		 * System.out.println("Thank you for using our ATM. Goodbye!");
		 * System.out.println("Credit Card Services");
			break;
		 */
			

		default:
			System.out.println("Invalid choice. Please select 1-4.");
		}

		sc.close();
	}

}
