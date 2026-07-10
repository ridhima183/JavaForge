package oopsdemo2;

/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :4:33:31 pm
 *email :ridhima.gadalay@gmail.com
 *private int min_bal; // can access only within the class
protected int  balance;  // can access within the class & in the sub class
 */
public class SavingsBank extends Account{

	private int min_bal; //can access only within the class 
	protected int balance; // can access within the class and in the sub class 

	// generate constructors using fields
	public SavingsBank(int accNo, String name, int min_bal, int balance) {
		super(accNo, name);
		this.min_bal = min_bal;
		this.balance = balance;
	}
	void display()
	{
		super.display(); // invoke super class method
		System.out.println ("Minimum Balance: "+min_bal);
		System.out.println ("Saving Balance: "+balance);
	}
}
