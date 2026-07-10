package oopsdemo3;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :2:17:57 pm
*email :ridhima.gadalay@gmail.com
*/

public class HomeLoan { //fimal class cannot be extended
	
	private String customerName;
	private double loanAmount;
	private final double PROCESSING_FEE;  // final variable (unique per customer, must be initialized once)

	public HomeLoan(String customerName, double loanAmount, double pROCESSING_FEE) {
		super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		PROCESSING_FEE = pROCESSING_FEE;
	}


	public void showLoanDetails() {
		System.out.println("Customer: " + customerName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Processing Fee: " + PROCESSING_FEE);
	}
	
	
}