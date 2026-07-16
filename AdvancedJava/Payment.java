package newfeatures;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :2:22:29 pm
 *email :ridhima.gadalay@gmail.com
 */
public interface Payment {

	void pay(double amount); // abstract method

	// Default method - common across all payments
	default void generateReceipt(double amount) {
		System.out.println("Receipt generated for payment of ₹" + amount);
	}

}

//upi payment class 
class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit/Debit Card ✅");
	}

	// Optionally override default method
	@Override
	public void generateReceipt(double amount) {
		System.out.println("Card Payment Receipt: ₹" + amount + " [Transaction Secured]");
	}
}

//Cash Payment Implementation

class CardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit/Debit Card ✅");
	}

	// Optionally override default method
	@Override
	public void generateReceipt(double amount) {
		System.out.println("Card Payment Receipt: ₹" + amount + " [Transaction Secured]");
	}
}

//Cash Payment Implementation
class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " in Cash ✅");
	}
}
