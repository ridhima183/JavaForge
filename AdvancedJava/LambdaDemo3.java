package newfeatures;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :10:54:03 am
 *email :ridhima.gadalay@gmail.com
 */
public class LambdaDemo3 {

	public static void main(String[] args) {

		NumericTest isEven=(n) -> (n%2==0); //lambda expression to check even number
		NumericTest isNegative =(n) ->(n<0); //lambda expression to check negative number

		System.out.println("7 is Even Number :" +isEven.ComputeTest(7));
		System.out.println("-55 is Negative Number :" + isNegative.ComputeTest(-55));

		//boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI

		//Lambda expression to check if a number is prime or not
		NumericTest isPrime = (n) -> {
			if (n <= 1)
				return false;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		};

		System.out.println("7 is Prime Number :" +isPrime.ComputeTest(7));



	}

}
