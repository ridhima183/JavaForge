package controlflow;

import java.util.Scanner;

/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :11:59:45 am
*email :ridhima.gadalay@gmail.com
*/
public class Factorial {
	
	public static void main(String[] args) {
		  int num, fact=1;
	      Scanner scanner=new Scanner(System.in);

	      System.out.println("Enter a Number : ");
	      num=scanner.nextInt();
	      scanner.close();

	      for (int i = 1; i <=num; i++) {
	         fact*=i;
	      }
	      System.out.println("The Factorial of "+num+" is: "+fact);
	}
	
}
