package StreamsDemo;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :4:23:32 pm
 *email :ridhima.gadalay@gmail.com
 *	Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores
 *  of the processor. 

		Normally any java code has one stream of processing, where it is executed sequentially. 
		Whereas by using parallel streams, we can divide the code into multiple streams that are 
		executed in parallel on separate cores and the final result is the combination of the 
		individual outcomes. 
		The order of execution, however, is not under our control.
 */

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		System.out.println("******************* Sequential Stream ****************");

		IntStream range=IntStream.rangeClosed(1, 20);
		//range.forEach(System.out::println);
		range.forEach(i->System.out.println(i+ " -> Thread : "+Thread.currentThread().getName()));

		System.out.println("******************* Parallel Stream ****************");

		IntStream range2=IntStream.rangeClosed(1, 20);
		//range2.parallel().forEach(System.out::println);
		range2.parallel().forEach(i->System.out.println(i+ " -> Thread : "+
				Thread.currentThread().getName()));
	}
}

