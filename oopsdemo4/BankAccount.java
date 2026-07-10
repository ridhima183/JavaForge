package oopsdemo4;

/**
 * Author : Bhavna
 * Date   : 09-Jul-2026
 * Time   : 10:32:27 am
 * Email  : ridhima.gadalay@gmail.com
 * 
 * Java Program to demonstrate Multiple Inheritance using Classes and Interfaces
 * for Banking Domain
 * 
 * Customer          : Base class representing a bank customer with customer details.
 * AccountOperations : Interface defining account-related operations like deposit and withdraw.
 * BankingServices   : Interface defining banking services like checking account balance and transferring funds.
 */
public class BankAccount extends Customer implements Accountoperations, BankingServices {

	private long accountNumber;
	private String accountType;
	private double balance;

	// Constructor
	public BankAccount(int customerId, String customerName, long accountNumber, String accountType, double balance) {
		super(customerId, customerName);
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.printf("₹%.2f deposited successfully.%n", amount);
			System.out.printf("Updated Balance : ₹%.2f%n", balance);
		} else {
			System.out.println("Invalid Deposit Amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Withdrawal Amount.");
		} else if (amount <= balance) {
			balance -= amount;
			System.out.printf("₹%.2f withdrawn successfully.%n", amount);
			System.out.printf("Updated Balance : ₹%.2f%n", balance);
		} else {
			System.out.println("Withdrawal Failed. Insufficient Balance.");
		}
	}

	@Override
	public void checkBalance() {
		System.out.printf("Current Balance : ₹%.2f%n", balance);
	}

	@Override
	public void transferMoney(double amount, String beneficiary) {
		if (amount <= 0) {
			System.out.println("Transfer Failed. Invalid Transfer Amount.");
		} else if (amount <= balance) {
			balance -= amount;
			System.out.printf("₹%.2f transferred to %s.%n", amount, beneficiary);
			System.out.printf("Remaining Balance : ₹%.2f%n", balance);
		} else {
			System.out.println("Transfer Failed. Insufficient Balance.");
		}
	}

	// Display Account Profile
	public void displayAccountDetails() {
		System.out.println("\n==============================");
		System.out.println("      BANK ACCOUNT DETAILS    ");
		System.out.println("==============================");
		System.out.printf("Account Number  : %d%n", accountNumber);
		System.out.printf("Account Type    : %s%n", accountType);
		System.out.printf("Current Balance : ₹%.2f%n", balance);
		System.out.println("==============================");
	}
}
