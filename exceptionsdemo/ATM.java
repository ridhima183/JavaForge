package exceptionsdemo;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :2:50:22 pm
 *email :ridhima.gadalay@gmail.com
 */
public class ATM {

	private double balance;

	//generate constructor 

	public ATM(double balance) {
		super();
		this.balance = balance;
	}

	// Method that may throw exception
	public void withdraw(double amount) throws ArithmeticException, IllegalArgumentException {
		if (amount > balance) {
			throw new ArithmeticException("❌ Insufficient Balance! Available: ₹" + balance);
		} else if (amount <= 0) {
			throw new IllegalArgumentException("❌ Withdrawal amount must be greater than 0.");
		}
		balance -= amount;
		System.out.println("✅ Withdrawal Successful! Amount: ₹" + amount);
		System.out.println("💰 Remaining Balance: ₹" + balance);
	}



}
