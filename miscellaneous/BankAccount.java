package miscellaneous;
/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :9:45:23 am
 *email :ridhima.gadalay@gmail.com
 */
public class BankAccount {


	private int accountNumber;
	private String customerName;
	private String accountType;
	private double balance;

	//generate constructors 

	public BankAccount(int accountNumber, String customerName, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
	}


	// Deposit
	public void deposit(double amount, StringBuffer transactionHistory) {
		balance += amount;
		transactionHistory.append("Deposited ₹")
		.append(amount)
		.append("\n");
	}


	// Withdraw
	public void withdraw(double amount, StringBuffer transactionHistory) {
		if (amount <= balance) {
			balance -= amount;
			transactionHistory.append("Withdrawn ₹")
			.append(amount)
			.append("\n");
		} else {
			transactionHistory.append("Withdrawal Failed (Insufficient Balance)\n");
		}
	}

	// Generate Statement using StringBuilder
	public String generateStatement(StringBuffer transactionHistory) {

		StringBuilder statement = new StringBuilder();

		statement.append("\n=====================================\n");
		statement.append("        BANK ACCOUNT STATEMENT\n");
		statement.append("=====================================\n");
		statement.append("Account Number : ").append(accountNumber).append("\n");
		statement.append("Customer Name  : ").append(customerName).append("\n");
		statement.append("Account Type   : ").append(accountType).append("\n");
		statement.append("Current Balance: ₹").append(balance).append("\n");
		statement.append("-------------------------------------\n");
		statement.append("Transaction History\n");
		statement.append("-------------------------------------\n");
		statement.append(transactionHistory);
		statement.append("=====================================\n");

		return statement.toString();
	}


}
