package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :3:54:36 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Passenger {

	//Single Inheritance example in Java for an Airline Booking System


	private String name;
	private int age;
	private String passportNumber;

    // generate constructors using fields 
	
	public Passenger(String name, int age, String passportNumber) {
		super();
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
	}



	public void displayPassengerInfo() {
		System.out.println("Passenger Name: " + name);
		System.out.println("Passenger Age: " + age);
		System.out.println("Passport Number: " + passportNumber);
	}



}
