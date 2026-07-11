package exceptionsdemo;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :12:34:02 pm
*email :ridhima.gadalay@gmail.com
*/
public class StringDemo {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String s1 = "Hello World";
		
		String s2 = null;
		
		try 
		{
			System.out.println(s1.length());
			System.out.println(s2.length());
			
		}
		catch(Exception a)
		{
			System.err.println("exception occured :" +a);
		}
	}

}
