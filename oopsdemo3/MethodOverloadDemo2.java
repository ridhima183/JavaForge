package oopsdemo3;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :11:03:57 am
*email :ridhima.gadalay@gmail.com
*/
public class MethodOverloadDemo2 {
	
	public static void main(String[] args) {
		
		// Using Default Constructor
        NotificationService service1 = new NotificationService();

        service1.sendNotification("Your salary has been credited.");

        System.out.println("--------------------------------");

        // Using Parameterized Constructor
        NotificationService service2 =
                new NotificationService("Coforge Technologies", "HR Department");

        service2.sendNotification("employee@coforge.com",
                "Your leave request is approved.");

        System.out.println("--------------------------------");

        service2.sendNotification("admin@coforge.com");
	}
	

}
