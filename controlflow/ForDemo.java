package controlflow;

/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :11:48:52 am
 *email :ridhima.gadalay@gmail.com
 * // For Loop Demonstration -
// use For Loop, when u want to execute a loop fixed no. of times
 */
public class ForDemo {

	public static void main(String[] args) {

		int i,j;

		System.out.println("Display Nos from 1-25");
		for (i=1;i<=25;i++) {
			System.out.print(i+"\t");
		}

		System.out.println();

		System.out.println("Display Nos from 100-75");
		for (j=100;j>=75;j--) {
			System.out.print(j+"\t");
		}

		System.out.println("\nDisplay Nos from 1-25 & 100-75 together");
		for (i=1,j=100; i<=25||j>=75; i++,j--) {
			if (i<=25) {
				System.out.println("i = " +i+ "\t");
			}
		}
		if (j>=75) {
			System.out.print(j+"\t");
		}	  
	}

}
