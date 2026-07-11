package exceptionsdemo;

import java.util.Scanner;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :2:53:13 pm
 *email :ridhima.gadalay@gmail.com
 */
public class ATMThrows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM(10000); // initial balance

		try {
			System.out.println("Enter withdrawal amount: ");
			double amount = sc.nextDouble();

			// Method call - must handle exception
			atm.withdraw(amount);

		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		} finally {
			System.out.println("🔒 Transaction session closed. Thank you for using our ATM!");
			sc.close();
		}
	}

}
