package StreamsDemo;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :4:14:57 pm
 *email :ridhima.gadalay@gmail.com
 */
import java.util.stream.IntStream;

public class PrimitiveStreamDemo {

	public static void main(String[] main) {


		/*display numbers from  1-100 
		 * 1. Loops
		 * 2. Streams
		 * 
		 * */
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}

		System.out.println();

		System.out.println("********** Display Nos from 1-100 using Intstreams **********");

		IntStream.range(1,  101).forEach(i -> System.out.print(i+" "));

		System.out.println("**************************************************************");



	}


}




