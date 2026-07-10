package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :12:28:14 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Product {

	private String name;
	private double price;

	// generate constructors 

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void display() {

		System.out.println("Name : "+name);
		System.out.println("Price: "+price);
	}
}


class Book extends Product{

	private String author;

	// generate constructors 

	public Book(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}

	// generate getters 

	public String getAuthor() {
		return author;
	}

	@Override
	void display() {

		super.display();
		System.out.println("Author :" +author);
	} 

	void showBookInfo() {
		System.out.println("Book Information: ");
		System.out.println("This book is a comprehensive guide to programming.");
		System.out.println("Published by Tech Publishers.");   	                
	}

}

class Laptop extends Product {

	private String manufacturer;

	//generate constructors 
	public Laptop(String name, double price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	//generate getter 
	public String getManufacturer() {
		return manufacturer;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manufacturer :" +manufacturer);
	} 

	void showSpecs() {
		System.out.println("Laptop Specifications: ");
		System.out.println("Processor: Intel i7");
		System.out.println("RAM: 16GB");
		System.out.println("Storage: 512GB SSD");
	}



}