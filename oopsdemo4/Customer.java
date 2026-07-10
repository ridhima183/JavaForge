package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :10:27:58 am
 *email :ridhima.gadalay@gmail.com
 *
 *java program to demonstrate multiple inheritance using classes and interfaces 
 */
public class Customer {

	//protected fields to be inherited by child classes

	protected int customerId;
	protected String customerName;

	//generate constructors 
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	//method to display customer details 
	// Method to display customer details
	public void displayCustomerDetails() {
		System.out.println("********* Customer Details ************");
		System.out.println("Customer ID   : " + customerId);
		System.out.println("Customer Name : " + customerName);
	}


}
