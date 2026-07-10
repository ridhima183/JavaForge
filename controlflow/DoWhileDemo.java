package controlflow;

import java.util.Scanner;

/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :11:31:51 am
*email :ridhima.gadalay@gmail.com
*Program to enter a Positive Number & display it
*/
public class DoWhileDemo {
	
	public static void main(String[] args) {
	
		int number;
	    Scanner scanner=new Scanner(System.in);
	    
	    do {
	    	System.out.println("The Entered Number is : ");
	    	number = scanner.nextInt();
	    	System.out.println(number);
	    }
		while (number>0);
	    System.out.println("The entered Number is :" +number);
	    scanner.close();			
	}
}
