package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :10:53:32 am
 *email :ridhima.gadalay@gmail.com
 */
public class NotificationService {

	// Attributes
	private String companyName;
	private String senderName;

	// Default Constructor
	public NotificationService() {
		companyName = "ABC Technologies";
		senderName = "sytem";
	}
	
	//parameterized Constructor 
	public NotificationService(String companyName, String senderName) {
		super();
		this.companyName = companyName;
		this.senderName = senderName;
	}


	// Method 1
	public void sendNotification(String message) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("SMS     : " + message);
	}

	// Method 2 (Overloaded)
	public void sendNotification(String email, String message) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("Email   : " + email);
		System.out.println("Message : " + message);
	}

	// Method 3 (Overloaded)
	public void sendNotification(String email, String message, int priority) {
		System.out.println("Company : " + companyName);
		System.out.println("Sender  : " + senderName);
		System.out.println("Email   : " + email);
		System.out.println("Message : " + message);
		System.out.println("Priority: " + priority);
	}



}
