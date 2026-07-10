package controlflow;

import java.util.Scanner;

/**
* Author :
* Date : Jul 4, 2026
* Time : 12:43:31 PM
* Email : sirinandini.a@gmail.com
*/

public class OddEven {
	
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+" is an Even Number.");
		}
		else {
			System.out.println(num + " is a Odd Number.");
		}
		
		scan.close();
		
	}

}