package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :9:47:05 am
 *email :ridhima.gadalay@gmail.com
 */
public class Author {

	//Aggregation Example


	private String authorName;
	private int age;
	private String place;
	
	//Generate constructors using fields 
	
	public Author(String authorName, int age, String place) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	//Generate getters 
	
	public String getAuthorName() {
		return authorName;
	}

	public int getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	}
	
}
