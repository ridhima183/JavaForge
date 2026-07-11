package exceptionsdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :12:43:11 pm
 *email :ridhima.gadalay@gmail.com
 * Java Program to demonstrate multiple catch blocks
 */
public class MultipleClassDemo {

	public static void main(String[] args) {

		BufferedReader br =
				new BufferedReader (new InputStreamReader (System.in));
		int a, b, c;

		try
		{
			System.out.println ("Enter Any 2 Numbers");
			a = Integer.parseInt (br.readLine ()); // Can throw IOException, NumberFormatException
			b = Integer.parseInt (br.readLine ()); // Can throw IOException, NumberFormatException
			System.out.println("Enter your Name : ");
			String name=br.readLine();             // Can throw IOException

			c = a / b;                             // Can throw ArithmeticException

			System.out.println ("C VALUE = " + c);
			System.out.println("Thank You "+name);
		}
		catch (NumberFormatException nfe)
		{
			System.err.println ("please pass only integer values "+nfe);
		}
		catch (ArithmeticException ae)
		{
			System.err.println ("please dont pass the second value as 0" +ae);
		}
		catch (IOException ioe)
		{
			System.err.println ("An I/O error occurred while reading input: " + ioe);
		}
		finally {
			try {
				if (br != null) {
					br.close(); // closing br itself can throw IOException
				}
			} catch (IOException e) {
				System.err.println("Error closing BufferedReader: " + e);
			}
			System.out.println("Inside Finally Block");
		}

		System.out.println("End of Main Method");
	}
}

