package oopdemo;

import java.util.Scanner;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :9:40:22 am
*email :ridhima.gadalay@gmail.com
*/
public class BookTest {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		//invoke setter methods-input
		b1.setBookId(101);
		b1.setBookName("Programming in c");
		b1.setPrice(500);
		b1.setPublisher("Prime Books"); 
		
		
		System.out.println("******Book Details******"); 
		b1.display();
		System.out.println(b1.getBookId() + " " + b1.getBookName() + " " + b1.getPrice() + " " + b1.getPublisher());
		System.out.println(b1); //invoke toString() methods of the instance class 
		
		
		Book b2=new Book();
		Scanner s=new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter Book Id, Name, Price & Publisher :");
		b2.setBookId(s.nextInt());
		s.nextLine();
		b2.setBookName(s.nextLine());
		b2.setPrice(s.nextFloat());
		s.nextLine();
		b2.setPublisher(s.nextLine());
		s.close();
		
		b2.display();
		System.out.println("************** Book Details *********************");
		System.out.println("Book Id                  :"+b2.getBookId());
		System.out.println("Book Name                :"+b2.getBookName());
		System.out.println("Book Price               :"+b2.getPrice());
		System.out.println("Book Publisher           :"+b2.getPublisher());
		System.out.println("Discounted Price of Book :"+b2.discountPrice());
		System.out.println("-------------------------------------------------");
		
		System.out.println(b2);// invokes toString() method of the instance class
	} 
} 