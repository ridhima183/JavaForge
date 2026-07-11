package exceptionsdemo;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :2:28:40 pm
*email :ridhima.gadalay@gmail.com
*/
public class ThrowDemo {
	
	public static void hello(int a) {
		
		if (a==0){
			throw new ArithmeticException("Pass Non Zero values"); // exception thrown manually 
		}
		else {
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		hello(100);
		hello(0);
	}

}
