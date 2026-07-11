package exceptionsdemo;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :3:01:54 pm
*email :ridhima.gadalay@gmail.com
*/
public class InSufficientFundsException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	//generate constructor 

	public InSufficientFundsException(double amount) {
		super();
		this.amount = amount;
	}
	
	
	//generate getter

	public double getAmount() {
		return amount;
	}	

}
