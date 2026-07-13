package collectionsdemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :12:02:52 pm
 *email :ridhima.gadalay@gmail.com
 *Program to iterate in ArrayList using various constructs
 */
public class ArrayListIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();

		names.add("James");
		names.add("Micheal");
		names.add("Andy");
		names.add("Jim");
		names.add("Robert");

		System.out.println(names);

		System.out.println("*** Display Collection using Iterator***");
		// Iterator Interface for traversing
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		names.add(3,"Raj"); // adding element in specified index
		names.remove(0); // delete first element
		names.set(1, "Java"); // replace existing element
		
		
		System.out.println("*** Display Collection using Enchanced For loop***");
		
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.45);
		marks.add(500.20);
		marks.add(768.25);
		marks.add(871.90);
		marks.add(450.45);
		
		System.out.println();
		for(Double i:marks)
		{
			System.out.println(i);
		}
		
		Collections.sort(marks);
		System.out.println(marks);

	}

}
