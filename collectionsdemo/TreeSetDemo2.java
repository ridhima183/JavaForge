package collectionsdemo;

import java.util.TreeSet;

/**
*Author : user
*Date : Jul 10, 2026
*Time : 3:00:31 PM
*Email : thejaswinivini@gmail.com
*/

public class TreeSetDemo2 {

	public static void main(String[] args) {
		//sorts the elements by ignoring the case.
				TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

		        students.add("Julia");
		        students.add("Robert");
		        students.add("Mark");
		        students.add("Steven");
		        students.add("mike");

		        System.out.println("Students TreeSet : " + students);

		        // Finding the size of a TreeSet
		        System.out.println("Number of elements in the TreeSet : " + students.size());

		        // Check if an element exists in the TreeSet
		        String name = "Julia";
		        if(students.contains(name)) {
		            System.out.println("TreeSet contains the element : " + name);
		        } else {
		            System.out.println("TreeSet does not contain the element : " + name);
		        }

		        // Navigating through the TreeSet
		        System.out.println("First element : " + students.first());
		        System.out.println("Last element : " + students.last());

		        name = "Robert";
		        System.out.println("Element just greater than "  + name + " : " + students.higher(name));
		        System.out.println("Element just lower than "  + name + " : " + students.lower(name));
		        

	}

}