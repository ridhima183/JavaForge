package controlflow;


/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :10:18:55 am
 *email :ridhima.gadalay@gmail.com
 *Program to display Numbers from 1-10 & 10- 1
 * Display ur name 10 times
 */
public class WhileDemo {

	public static void main(String[] args) {

		//Loop Initialization
		int i=1;

		System.out.println("********* Forward Loop **********");
		//Set Condition to Loop

		while (i<=10) {
			System.out.println(i+ " - Ridhima Gadalay");
			i=i+1;
		}
		
		System.out.println("*********** Reverse Loop ************");

		int j = 20;

		while (j>=1) {
			System.out.print(j+"\t");
			j=j-1;	
		}
	}

}
