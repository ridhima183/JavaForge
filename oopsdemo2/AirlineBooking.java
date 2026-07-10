package oopsdemo2;

import java.util.Scanner;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :3:55:45 pm
 *email :ridhima.gadalay@gmail.com
 */
public class AirlineBooking extends Passenger{
	String FlightName;
	String fromCity;
	String toCity;
	int SeatNumber;
	float ticketPrice;

	Scanner scanner = new Scanner(System.in);

	//generate constructor using super class
	public AirlineBooking(String name, int age, String passportNumber) {
		super(name, age, passportNumber);
	}


	void bookTicket() {

		System.out.println("Enter Flight Name :");
		FlightName = scanner.next();
		System.out.println("Enter From City :");
		fromCity = scanner.next();
		System.out.println("Enter To City :");
		toCity = scanner.next();
		System.out.println("Enter Seat No :");
		SeatNumber = scanner.nextInt();
		System.out.println("Enter Ticket Price :");
		ticketPrice = scanner.nextFloat();
	}

	void displayBookingDetails() {
		System.out.println("************* Booking Details ***********");
		System.out.println("Flight Name  :  " + FlightName);
		System.out.println("From City    :  " + fromCity);
		System.out.println("To City      :  " + toCity);
		System.out.println("Seat No      :  " + SeatNumber);
		System.out.println("Ticket Price :  " + ticketPrice);
	}
}
