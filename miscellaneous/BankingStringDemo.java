package miscellaneous;
/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :9:51:53 am
 *email :ridhima.gadalay@gmail.com
 */
public class BankingStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String (Immutable)
		String bankName = "ABC National Bank";

		System.out.println("Welcome to " + bankName);

		BankAccount customer = new BankAccount(
				101001,
				"Rajashekar",
				"Savings",
				50000);

		// StringBuffer (Thread-safe Transaction History)
		StringBuffer transactionHistory = new StringBuffer();

		customer.deposit(10000, transactionHistory);
		customer.withdraw(5000, transactionHistory);
		customer.deposit(2500, transactionHistory);
		customer.withdraw(70000, transactionHistory);

		// StringBuilder (Fast Statement Generation)
		String statement = customer.generateStatement(transactionHistory);

		System.out.println(statement);

		// Demonstrating String Immutability
		String branch = "Hyderabad";
		System.out.println("Original Branch : " + branch);

		branch.concat(" Main Branch"); // Doesn't modify original string

		System.out.println("After concat()  : " + branch);

		branch = branch.concat(" Main Branch");

		System.out.println("After Reassign  : " + branch);


	}

}

