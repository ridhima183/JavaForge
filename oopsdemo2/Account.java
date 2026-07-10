package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :4:31:24 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Account {

	private int accNo;
	private String name;
	//generate constructors using fields 
	public Account(int accNo, String name) {
		super();
		this.accNo = accNo;
		this.name = name;
	}

	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
