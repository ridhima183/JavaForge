package exceptionsdemo;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :3:08:31 pm
 *email :ridhima.gadalay@gmail.com
 */
public class CheckingAccount {

	private double balance;
	private int number;

	//generate constructor 

	public CheckingAccount(int number) {
		super();
		this.number = number;
	}

	//generate getters 

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}


	public void deposit(double amount) {
		balance += amount;
	}

	// method may throw user defined exception - InSufficientFundsException
	public void withdraw(double amount) throws InSufficientFundsException {
		if(amount <= balance) {
			balance -= amount;
		}else {
			double needs = amount - balance;
			throw new InSufficientFundsException(needs);
		}
	}



}
