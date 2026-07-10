package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :11:55:15 am
 *email :ridhima.gadalay@gmail.com
 *Override demo 
 */
public class Account {

	private String name;
	protected double balance;

	//generate constructor
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	void withdraw(double amt) {
		balance -= amt;
		System.out.println("WithDrawing: " + amt);

	}

	//generate getters

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	// final methods cannot be overridden
	final void deposit(double amt) {
		balance += amt;
		System.out.println("Depositing: " + amt);
	}







}
