package exceptionsdemo;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :2:35:30 pm
 *email :ridhima.gadalay@gmail.com
 */
public class ThrowDemo2 {

	public static void checkEligibility(int age,int weight)
	{
		if(age < 12 || weight <40)
		{
			throw new ArithmeticException("Student is Not Eligible for Registration");
		}
		else
		{
			System.out.println("Student with age :"+age+ " and with Weight "+weight+" is Eligible");
		}
	}

	public static void main(String[] args) {

		// Using try-catch to properly handle the custom thrown exception
		try {
			System.out.println("Welcome to Sports Eligibility Process..");
			checkEligibility(20,45);
			System.out.println("Thank You");
			checkEligibility(10,44);
		} catch (ArithmeticException e) {
			// This catches the exception explicitly triggered by the 'throw' keyword above
			System.out.println("Registration Failed: " + e.getMessage());
		}

	}
}
