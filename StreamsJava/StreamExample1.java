package StreamsDemo;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :3:12:35 pm
 *email :ridhima.gadalay@gmail.com
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		//Java Program to demonstrate Stream API in Java 8 using Sequential Stream.

		List<Integer> grades = new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);

		//Build stream from Collections
		Stream<Integer>	strm1 = grades.stream();
		
		System.out.println("************ArrayList Contents*************");
		strm1.forEach(System.out::println);
		
		// FIXED: Removed .toList() from the middle of the stream chain
		List<Integer> squares = grades.stream()
				.map(m -> m * m)
				.collect(Collectors.toList());
		
		System.out.println("************* Double of Grades ***************");
		System.out.println(squares);
		
		Integer[] marks = { 45, 88, 99, 45, 75, 23};
		//Build stream from Arrays
		Stream<Integer> strm  = Stream.of(marks);

		//Terminal operation - forEach()
		// Lambda expressions are used to pass as parameters to another function

		strm.forEach(i-> System.out.println(i));

		Stream<Integer> strm11=Stream.of(marks);


		//Intermediate operation - filter() & terminal operation - forEach()
		strm11.filter(i->i>50).forEach(i->System.out.println(i));
	}
}
	