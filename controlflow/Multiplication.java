package controlflow;

import java.util.Scanner;
/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :12:17:09 pm
*email :ridhima.gadalay@gmail.com
*/
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num, mul;
	        Scanner scanner=new Scanner(System.in);

	        System.out.println("Enter a Number : ");
	        num=scanner.nextInt();
	        scanner.close();

	        System.out.println("Multiplication Table of : "+num);
	        for (int i = 1; i <=10; i++) {
	            mul=num*i;
	            System.out.println(num+" * "+i+" = "+mul);
	        }

	}

}
