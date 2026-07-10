package controlflow;
import java.util.Scanner;

/**
* Author : ridhima
* Date : Jul 4, 2026
* Time : 12:36:34 PM
* Email : ridhima.gadalay@gmail.com
* Java Program to find Greatest of 2 Numbers
*/

public class Greatest2 {
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter 2 Numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
			
		//Implementing Conditional Statements
		
		if (a > b) {
			System.out.println(a+" is greater.");
		}
		else {
			System.out.println(b+ " is greater.");
		}
		
		scan.close();
		
		
	}

}