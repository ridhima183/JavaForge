package controlflow;

import java.util.Scanner;
/**
*Author : Bhavna
*Date : 04-Jul-2026
*Time :4:23:12 pm
*email :ridhima.gadalay@gmail.com
*/
public class GreatestThree {
	
	// Program to find Greatest of 3 Numbers using If...Else If...Else Statement
	
	public static void main(String[] args) {
		
		int a,b,c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 3 Numbers : ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        
        if (a>b && a>c) {
        	System.out.println(a+" is greatest");    
        }
        
        else if (b>c) {
        	System.out.println(b+" is greatest");
        }
        
        else if (a==b && b==c) {
        	System.out.println("all numbers are equal");
        }
        else {
        	System.out.println(c+" is greatest");
        }
		scan.close();
	}

}
