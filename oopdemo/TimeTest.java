package oopdemo;
import java.util.Scanner;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :2:32:24 pm
*email :ridhima.gadalay@gmail.com
*/
public class TimeTest {
	
	public static void main(String[] args) {
		Time t1 = new Time(2,43,5);
		Time t2 = new Time(12,20,33);
		
		t1.add(t2);
		System.out.println("the addition of time1 and time2  : ");
		t1.display();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time t1 and t2:");
		
		int hrs = sc.nextInt();
		int mins = sc.nextInt();
		int sec = sc.nextInt();
		
		Time t3 = new Time(hrs,mins,sec);
		t1.add(t3);
		System.out.println("the addition of time1 and time2 : ");
		t1.display();
		
		sc.close();

	}

}
