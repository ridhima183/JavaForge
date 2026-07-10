package oopdemo;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :12:54:10 pm
*email :ridhima.gadalay@gmail.com
*Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented by 1 & sec -60,,
 *   if min> 60  ... hrs should be incremented by 1 & min -60
*/
public class Time {
	
	private int hrs;
	private int mins;
	private int sec;

	// Generate constructors using fields 
	
	public Time(int hrs, int mins, int sec) {
		super();
		this.hrs = hrs;
		this.mins = mins;
		this.sec = sec;
	}
	
	public void add(Time obj) {
		
		if ((this.sec + obj.sec) >= 60) {
			this.mins += (this.sec + obj.sec)/60;
			this.sec = (this.sec + obj.sec) % 60;
	
		}
		else {
			this.sec = (this.sec + obj.sec);
		}
			
		if ((this.mins + obj.mins) >= 60) {
			this.hrs += (this.mins + obj.mins)/60;
			this.mins = (this.mins + obj.mins) % 60; 	
		}
		else {
			this.mins = (this.mins + obj.mins);				
		}
		
		if ((this.hrs + obj.hrs) >= 24) {
			this.hrs = (this.hrs + obj.hrs) % 24;
		}
		
		else {
			this.hrs = this.hrs + obj.hrs;
		}		
		
	}
	
	  public void display()
		{
			System.out.println(this.hrs +":" +this.mins +":" + this.sec );
		}

}
