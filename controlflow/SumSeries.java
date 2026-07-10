package controlflow;

import java.util.Scanner;
/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :10:43:15 am
*email :ridhima.gadalay@gmail.com
*/
public class SumSeries {

	public static void main(String[] args) {
		int num,i=1,sum=0;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter a limit :");
		num=scan.nextInt();
		scan.close();
		
		while (i<=num) {
			sum=sum+i;
			i+=1;
		}
		System.out.print("Sum of the series: " +sum);
	}

}
