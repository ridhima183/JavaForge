package exceptionsdemo;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :3:11:30 pm
 *email :ridhima.gadalay@gmail.com
 */
public class BankDemo {

	public static void main(String[] args) {

		//Demo program to show user defined exception


		CheckingAccount c1=new CheckingAccount(101);

		System.out.println("Depositing 5000$........");
		c1.deposit(5000);

		try
		{
			System.out.println("Withdrawing 1000$");
			c1.withdraw(1000);

			System.out.println("Withdrawing 6000$");
			c1.withdraw(6000);
		}

		catch(InSufficientFundsException e) // catching user defined exception
		{
			System.out.println("Sorry Insufficient Balance : "+c1.getBalance());
			e.printStackTrace();
		}
	}

}
