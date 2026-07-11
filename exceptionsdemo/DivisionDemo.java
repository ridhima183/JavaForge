package exceptionsdemo;

import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :12:03:58 pm
 *email :ridhima.gadalay@gmail.com
 *program to perform division of 2 nos without exception handling
 *program to perform division of 2 nos without exception handling
 */

public class DivisionDemo {

	public static void main(String[] args) {

		// program to perform division of 2 nos with exception handling


		int a, b;
		int result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers");
		a = input.nextInt();
		b = input.nextInt();  // enter 0

		result =  a / b;  // JRE Throws Arithmetic exception

		try {
			result =  a / b ;
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException e) {
			System.err.println("Divide by zero Error- Enter non zero value");
			System.err.println("Exception Description : "+e.getMessage());
			System.err.println("Exception name and description : "+e.toString());

			e.printStackTrace(); }

		finally {
			input.close();
			System.out.println("In finally block-program execution ended");
		}



	}
}