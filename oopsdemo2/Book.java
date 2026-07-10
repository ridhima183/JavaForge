package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :9:48:35 am
 *email :ridhima.gadalay@gmail.com
 *	In Java, aggregation represents HAS-A relationship, 
 * which means when a class contains reference of another class known to have aggregation.
 * 
 * When you want to use some property or behaviour of any class without the requirement of modifying it 
 * or adding more functionality to it, in such case Aggregation 
 */
public class Book {

	private String name;
	private int price;

	//Aggregation
	private Author author;
	private Publisher publisher;

	// Generate constructors using fields 
	public Book(String name, int price, Author author, Publisher publisher) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}


	void display()
	{
		System.out.println("*************** Book Details ****************");
		System.out.println("Book Name    : "+name);
		System.out.println("Book Price   : "+price);

		System.out.println("------------Author Details----------");
		System.out.println("Author Name  : "+author.getAuthorName());
		System.out.println("Author Age   : "+author.getAge());
		System.out.println("Author place : "+author.getPlace());

		System.out.println("------------Publisher Details-------");
		System.out.println("Publisher Name: "+publisher.getName());
		System.out.println("Publisher ID  : "+publisher.getPublisherID());
		System.out.println("Publisher City: "+publisher.getCity());

	}
}