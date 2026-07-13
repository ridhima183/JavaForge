package collectionsdemo;

import arraysdemo.Developer;
import java.util.ArrayList;
import java.util.Collections;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :4:52:36 pm
*email :ridhima.gadalay@gmail.com
*/
public class ComparatorDemo {
	
	/*
	 * Comparator interface is used to order the objects of user-defined classes.
	 * It sorts based on multiple attributes of the class.
	 */
	public static void main(String[] args) {
	 
		ArrayList<Developer> a1 = new ArrayList<Developer>();
			
		Developer d1 = new Developer(103, "Mike", "Java");
		Developer d2 = new Developer(105, "Mary", "Dot Net");
		Developer d3 = new Developer(101, "Ravi", "Angular");
		Developer d4 = new Developer(102, "Hary", "Php");
		Developer d5 = new Developer(104, "Navin", "Oracle");
		Developer d6 = new Developer(106, "Raj", "C#");
		Developer d7 = new Developer(107, "Helen", "C++");
			
		// Adding developers to ArrayList
		a1.add(d1); a1.add(d2); a1.add(d3); a1.add(d4); a1.add(d5); a1.add(d6); a1.add(d7);
			
		System.out.println("-------- UnSorted -----------");
		for(Developer i : a1) {
			System.out.println(i.getId() + " " + i.getName() + " " + i.getDomain());
		}
			
		// Sort by Id
		Collections.sort(a1, new IdComparator()); // Invokes compare method of IdComparator
			
		System.out.println("\n-------- Sort By Id -----------");
		for(Developer i : a1) {
			System.out.println(i.getId() + " " + i.getName() + " " + i.getDomain());
		}
			
		// Sort by Domain of developer
		Collections.sort(a1, new DomainComparator());
			
		System.out.println("\n-------- Sort By Domain -----------");
		for(Developer i : a1) {
			System.out.println(i.getId() + " " + i.getName() + " " + i.getDomain());
		}
	}
}
