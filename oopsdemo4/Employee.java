package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :2:55:12 pm
 *email :ridhima.gadalay@gmail.com
 */
// 1. Added 'abstract' keyword to the class
public abstract class Employee { 

	private String name;
	protected double basic;
	private String address;

	public Employee(String name, double basic, String address) {
		super();
		this.name = name;
		this.basic = basic;
		this.address = address;
	}

	void show() {
		System.out.println("Name: \t\t\t" + name);
		System.out.println("Address: \t\t" + address);
		System.out.println("Basic: \t\t\t" + basic);
	}

	double deduction(int leave) {
		double lessPay;

		if(leave==0)
		{
			lessPay=0;
		}
		else if (leave <= 5) {
			lessPay = (0.25 * basic);
		} 

		else {
			lessPay = (0.5 * basic);
		}
		return lessPay;
	}
	
	// 2. Properly terminated the abstract method with a semicolon
	abstract double totalPay(); 
}
