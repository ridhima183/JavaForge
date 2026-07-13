package collectionsdemo;
/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :12:19:09 pm
*email :ridhima.gadalay@gmail.com
*/
public class Book {
	
	int id;  
	String name,author,publisher;  
	int quantity;
	
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}


	public String getPublisher() {
		return publisher;
	}


	public int getQuantity() {
		return quantity;
	}
	
	
	
	

}
