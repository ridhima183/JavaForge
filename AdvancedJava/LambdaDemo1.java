package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :10:19:31 am
*email :ridhima.gadalay@gmail.com
*/
public class LambdaDemo1 {
	
	public static void main(String[] args) {
		
		Calculator op1=(a,b) -> a+b; // lambda expression 
		//int c=(a,b) --> a+b                       //invoke lambda expression 
		System.out.println("Additon of 2 Nos is : " +op1.calculate(200, 155)); //Calculator is a functional interface 
		
		Calculator op2=(a,b) -> (a-b);
		System.out.println("Difference of 2 Nos is : " +op2.calculate(200, 155));
		
		Calculator op3=(a,b) -> (a*b);
		System.out.println("Product of 2 Nos is : " +op3.calculate(200, 155));
		
		Calculator op4=(a,b) -> (a/b);
		System.out.println("Division of 2 Nos is : " +op4.calculate(200, 155));
		
		Calculator op5 = (int a, int b) -> {
			
			if (a>b) {
				return a ;
			} else {
				return b; 
			}
		};
		
		System.out.println("Maximum of 2 numbers is " +op5.calculate(200,155));
	}

}
