package exceptionsdemo;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :2:39:56 pm
 *email :ridhima.gadalay@gmail.com
 */
public class ThrowsDemo {

	void Division() throws ArithmeticException,NumberFormatException
	{
		int a=45,b=0,rs;

		rs = a / b;
		System.out.print("\n\tThe result is : " + rs); 
	}
	
	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo();
		try
		{
			T.Division(); 
		}
		catch (NumberFormatException Ex) {
			System.err.print("\n\tError : " +Ex.getMessage());
		}
		catch(ArithmeticException Ex)
		{
			System.err.println("\n\tError : " +Ex.getMessage());
		}
		System.out.print("\n\tEnd of program");
	} 

}
