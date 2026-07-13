package collectionsdemo;
/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :4:28:41 pm
*email :ridhima.gadalay@gmail.com
*/

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		/* Collections is an utility class in java.util package. 
		It consists of only static methods which are used to operate on objects 
		of type Collection. 
	  */
	  
	  
	  	// Create a list of strings
			ArrayList<String> al = new ArrayList<String>(5);
			al.add("Java For Developers");
			al.add("Friends");
			al.add("Dear");
			al.add("Is");
			al.add("Superb");


			System.out.println("Array List Before Sorting :"+al);
			Collections.sort(al);

			// Let us print the sorted list
			System.out.println("List after the use of" +
					" Collection.sort() :\n" + al);

		
			int pos=Collections.binarySearch(al,"Superb");
			System.out.println("The position of \"Superb\" in Arraylist is :"+pos);

			//Sort in descending Order
			Collections.sort(al,Collections.reverseOrder());
			System.out.println("Array List Sorting in Descending Order: "+al);

			
			Collections.reverse(al);
			System.out.println("List after the Reversing"+ al);

			Collections.swap(al,4,1);
			System.out.println("List after the SWaping"+ al);

			Collections.shuffle(al);
			System.out.println("List after the Shuffle"+ al);

			ArrayList<String> n=new ArrayList<String>(5);
			n.add("Java");
			n.add("Fri");
			n.add("De");
			n.add("Ist");
			n.add("Sup");
			System.out.println(n);

			Collections.copy(n, al);
			System.out.println("The new ArrayList Contents:"+n);
			n=al;
			System.out.println("The new ArrayList Contents:"+n);

			ArrayList<String> n1=new ArrayList<String>(5);
			n1.addAll(al);
			System.out.println(n1);

			Object n2=new ArrayList<String>(5);
			n2= al.clone();
			System.out.println(n2);   
		
	}
}	