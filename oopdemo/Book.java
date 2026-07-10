package oopdemo;

/**
 * Author : sirin
 * Date : Jul 7, 2026
 * Time : 9:35:01 AM
 * Email : sirinandini.a@gmail.com
 */

public class Book {
	//properties
	private int bookId;
	private String bookName;
	private float price;
	private String publisher;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", publisher=" + publisher
				+ ", getBookId()=" + getBookId() + ", getBookName()=" + getBookName() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + ", discountPrice()=" + discountPrice() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void display()
	{
		System.out.println("************* Welcome to Coforge Library **************");
	}

	public float discountPrice()
	{
		return ((this.price)-(this.price*.10f));
	}

	// Generate toString() Method -- Converts Object in to String


}