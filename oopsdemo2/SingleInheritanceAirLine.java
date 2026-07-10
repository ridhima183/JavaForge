package oopsdemo2;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :4:01:52 pm
*email :ridhima.gadalay@gmail.com
*/
public class SingleInheritanceAirLine {
	
	public static void main(String[] args) {
		
		// Create booking (child class object)
        AirlineBooking booking1 = new AirlineBooking("James Gosling", 32,"FG567766");
        
        booking1.bookTicket();
        booking1.displayPassengerInfo();
        booking1.displayBookingDetails();
        
     // Create booking (child class object)
        AirlineBooking booking2 = new AirlineBooking("Rod Johnson", 32,"ZWER34567");
        
        
        booking2.bookTicket();
        booking2.displayPassengerInfo();
        booking2.displayBookingDetails();
	}

	
}
