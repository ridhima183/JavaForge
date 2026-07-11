package exceptionsdemo;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :12:24:55 pm
*email :ridhima.gadalay@gmail.com
*/
public class GeneralExceptionDemo {
	
	public static void main(String[] args) {
		
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
		
		try {
			//for (int i = 0; i<=5; i++)
			for (int i = 0; i<5; i++)
			{
				System.out.println(languages[i]);
			}
		}
		
		catch (Exception e) { //general; Exception Handling
			
			e.printStackTrace(); //predefined method to display the exception messages
			System.err.println("error Occured");
			
		}
		
		finally {
			System.out.println("In Finally Block - Program Execution ended");
		}
		
	}

}
