package newfeatures;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :12:08:25 pm
 *email :ridhima.gadalay@gmail.com
 */

//Method Reference - Shorthand of Lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod(int a);
}

class Test // instance class
{
	void display(int x) // instance method
	{
		System.out.println("Iam a Instance Method"+x);
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
		//traditional approach 
		Test t1 = new Test();
		t1.display(100);
		
		//java8 Method Reference approach 
		MyInterface m1ref = t1::display; // method reference to instance method of object
		
		//calling method of FI 
		m1ref.myMethod(200);
		
		//lambda ---> FI 
		//MR --- shorthand of Lambda 
		//MR ---> FI 
		

	}

}
