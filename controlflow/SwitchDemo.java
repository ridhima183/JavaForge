package controlflow;

import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :9:40:42 am
 *email :ridhima.gadalay@gmail.com
 *Java Program to demonstrate the Switch Statement in Java for displaying the day 
 * of the week based on user input.
 */
public class SwitchDemo {

	public static void main(String[] args) {
		
		int day;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter Day Number (1-7):");
		day = scan.nextInt();

		
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			
			default:
				System.out.println("Invalid day! Please enter a number between 1 and 7.");
				break;
		} 

		scan.close(); 
	} 
}
