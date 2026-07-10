package oopsdemo3;

/**
 * Author : sirin
 * Date : Jul 8, 2026
 * Time : 12:00:03 PM
 * Email : sirinandini.a@gmail.com
 */

public class SavingsAccount extends Account{

	private double InterestRate;

	public SavingsAccount(String name, double balance, double i) {
		super(name, balance);
		this.setInterestRate(i);
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
}

class CheckingAccount extends Account {
	private double overDraft; //pre sanctioned loan (if account balance is less and a withdraw money is > the bank balance , the extra money is taken from the overdraft 

	public CheckingAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	@Override
	void withdraw(double amt) {
		System.out.println("Overdraft Amount: " + overDraft);
		
		
		if (amt <= balance) {
			balance -= amt;
			System.out.println("Withdrawing: " + amt);
		} else if ((amt > balance) && (amt > (balance + overDraft))) {
			System.out.println("Sorry! You cannot withdraw");
		} else {
			double result = amt - balance;
			overDraft -= result;
			balance = 0;

			System.out.println("Withdrawing: " + amt);
			System.out.println("Current Overdraft Amount: "
					+ overDraft);
		}
	}

}