package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :12:23:00 pm
 *email :ridhima.gadalay@gmail.com
 *Program to store User Defined class Objects in ArrayList
 */
public class ArrayListDemo2 {

	public static void main(String[] args) {

		// Create list of Books
		List<Book> bList = new ArrayList<>();

		//Creating Books  object & initialized using Book Constructor
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
		
		//add books to list
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		
		//Traverse a list 
		System.out.println("********** Book Details **********");
		for (Book i : bList)
		{
			System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);
		}
        System.out.println("total number of books :" +bList.size());

	}

}
