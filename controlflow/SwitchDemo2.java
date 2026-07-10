package controlflow;

import java.util.Scanner; 

/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :9:48:07 am
 *email :ridhima.gadalay@gmail.com
 *Java Program to demonstrate the Switch Statement 
 * to perform Arithmetic Operations based on user input.
 */
public class SwitchDemo2 {

	public static void main(String[] args) {

		// Fixed: Initialized result to 0 to prevent uninitialized variable errors
		float num1, num2, result = 0;
		String operator;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number :");
		num1 = scan.nextFloat(); 
		System.out.println("Enter Second Number :");
		num2 = scan.nextFloat(); 

		System.out.println("Enter Operator (+, -, *, /) :");
		operator = scan.next();
		
		switch(operator) {
			case "+":
				result = num1 + num2;
				System.out.println("Result: " + result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println("Result: " + result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println("Result: " + result);
				break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println("Result: " + result);
				}
				else {
					System.out.println("Division error, denominator is 0");
					result = 0; // Fixed: Explicitly handles the logic gap for result
				}
				break;
			default:
				System.out.println("Invalid Operator. Please Enter the right one");
				break;
		}
		
		scan.close(); // Clean up scanner
	}
}
