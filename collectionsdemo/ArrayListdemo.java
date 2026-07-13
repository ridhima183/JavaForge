package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :11:20:01 am
*email :ridhima.gadalay@gmail.com
*/
public class ArrayListdemo {
	
	public static void main(String[] args) {
		
		//generic arrayList of String type 
		ArrayList<String> a1 = new ArrayList<>();
		
		//add elements to array list and it maintains the order of insertion 
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		a1.add("Java"); //duplicate elements
		a1.add("Python");
		
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>(); //here Integer is a wrapper class that converts the primitive datatype to an object
		
		a2.add(100);
		a2.add(200);
		a2.add(300);
		System.out.println(a2);
		
		//get elements by index
		System.out.println("Element at index 1 : "+a1.get(1));
		
		System.out.println("Does list contains element Java ? : " +a1.contains("java"));
		
		//add elements at specific index 
		a1.add(2,"oeacle");
		System.out.println(a1);

		System.out.println("is ArrayList Empty ? " +a1.isEmpty());
		System.out.println("index of perl : " +a1.indexOf("Perl"));
		System.out.println("size of ArrayList : " +a1.size());
		
		//collections is a utility class 
		Collections.sort(a1);
		System.out.println("array List after sorting : " +a1);
		
		//a1.add(100); //compiler error 
		
		a2.add(750);
		a2.add(2100);
		a2.add(1300);
		a2.add(150);
		a2.add(20);
		a2.add(307);
		
		Collections.sort(a2);
		System.out.println("array List after sorting : " +a2);
		System.out.println("size of ArrayList : " +a1.size());
     }

}
