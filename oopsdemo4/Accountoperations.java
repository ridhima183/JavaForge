package oopsdemo4;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :10:24:23 am
*email :ridhima.gadalay@gmail.com
*/
public interface Accountoperations {
	
	void deposit(double amount);
	void withdraw(double amount);

}

interface BankingServices {
	
	void checkBalance();
	void transferMoney(double amount, String beneficiary);
}
