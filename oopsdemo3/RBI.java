package oopsdemo3;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :2:14:16 pm
*email :ridhima.gadalay@gmail.com
/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class
*/

public final class RBI {

	/*
	Final Variable - Variable’s content cannot be modified
	Final Method - A final method cannot be overridden. 
	Final Class - Cannot extend a Final class

	*/
	//final variable
	public static final double MIN_HOME_LOAN_RATE=6.5;
	//final method
	
	  public final void showRBIGuidelines() {
	        System.out.println("📌 RBI Guideline: Minimum Home Loan Interest Rate = " + MIN_HOME_LOAN_RATE + "%");
	    }
}
