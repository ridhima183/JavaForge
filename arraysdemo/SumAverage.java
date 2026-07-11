package arraysdemo;
import java.util.Arrays;
/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :12:54:28 pm
 *email :ridhima.gadalay@gmail.com
 */
public class SumAverage {
	public static void main(String[] args) {

		int[] number = { 2,-9,0,5,12,-25,22,9,8,11,10};
		int sum = 0;
		float avg = 0.00f;

		//Access Array elements using For each loop

		for (int i : number) {
			sum+=i; 
		}
		avg=(float)sum/number.length;

		System.out.println("The Array Contents : "+ Arrays.toString(number));
		System.out.println("The Sum of Array Elements : "+sum);
		System.out.println("The Average of Array Elements : "+avg);
	}

}
