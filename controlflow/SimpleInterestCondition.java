package controlflow;

import java.util.Scanner;

/**
* Author : Bhavna
* Date : Jul 4, 2026
* Time : 12:05:25 PM
* Email : ridhima.gadalay@gmail.com
* BufferedReader is a class in the java.io package that provides a way to read input from a 
* stream in a buffered fashion.
* This means that it reads data from the stream in chunks and stores it in memory,
*  allowing for more efficient reading of large amounts of data.
*  InputStreamReader is a class that converts an InputStream into a Reader.
*  It is used to read input from a stream of bytes into a stream of characters.
*  BufferedReader can work with InputStreamReader to read input of different data types.
*
*  Java Program to demonstrate BufferReader methods for Taking Input at Runtime
*
*  Calculate Simple Interest for a given Loan amount  greater than 1 Lac
*/

public class SimpleInterestCondition {
	
	public static void main(String[] args) {
		

	    String customerName;
		double principal;
		float si;
		int term,rate;
			
		///Create scanner object for taking input at runtime
		Scanner scan = new Scanner(System.in);
			
		//Input
		System.out.println("*********** Soft Bank - Simple Interest Calculation *********");
		System.out.println("Enter Customer Name : ");
		customerName=scan.nextLine();//Multiple words input
		System.out.println("Enter Loan Amount   : ");
		principal=scan.nextDouble();
		System.out.println("Enter Loan Term     : ");
		term=scan.nextInt();
		System.out.println("Enter Rate of Interest :");
		rate=scan.nextInt();
			
		//Calculate Simple Interest
		si=(float) (principal*term*rate)/100;
		
		
		if (principal >= 100000) {
			//Output
			System.out.println("************ Loan Details ************************");
			System.out.println("Customer Name           : "+customerName);
			System.out.println("Principal Amount        : "+principal);
			System.out.println("Term                    : "+term);
			System.out.println("Rate of Interest        : "+rate);
			System.out.println("--------------------------------------------------");
			System.out.println("Simple Interest         : "+si);
			System.out.println("--------------------------------------------------");			
			
		}
		
		else {
			System.out.println("Not Eligible for Loan. Please avail above 1 Lac");
		}
		

		
		scan.close();
	}

}