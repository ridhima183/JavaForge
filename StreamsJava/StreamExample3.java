package StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :4:09:19 pm
 *email :ridhima.gadalay@gmail.com
 */
public class StreamExample3 {
	
		public static void main(String[] args) {
			List<String> names=new ArrayList<>();
			names.add("Amit");
			names.add("Shekar");
			names.add("Aman");
			names.add("Rahul");
			names.add("Sonam");
			names.add("Salman");
			names.add("Lokesh");
			names.add("Navin");

			//pipeline methods								//String.UpperCase(s)	
			names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).
			forEach(System.out::println);

			System.out.println("*********** Sorted Operation *************");
			names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

			//Collect Operation--> Convert stream to List
			List<String> namesUpperCase=names.stream().sorted().map(String::toUpperCase).
					collect(Collectors.toList());
			System.out.println("************** New List *********************");
			System.out.println(namesUpperCase);

			//Count Operation
			long cnt=names.stream().count();
			System.out.println("No of Elements : "+cnt);

			long cnt1=names.stream().filter((s) -> s.startsWith("A")).count();
			System.out.println("No. of Names starting with A : "+cnt1);

			//reduce operation -- combines elements of a stream and produce a single value
			Optional<String> red=names.stream().reduce((s1,s2) ->s1 + "#"+s2);
			red.ifPresent(System.out::println);

			Integer[] marks= {45,88,99,45,75,23};
			int sum=Arrays.stream(marks).reduce(0, (ans,i) -> ans + i);
			System.out.println("Sum of Marks : "+sum);
		}

	}

