package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :9:45:46 am
 *email :ridhima.gadalay@gmail.com
 */
public class Publisher {

	//Aggregation Example


	private String name;
	private String publisherID;
	private String city;

	//Generate constructors using fields

	public Publisher(String name, String publisherID, String city) {
		super();
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}

	//generate getters 

	public String getName() {
		return name;
	}

	public String getPublisherID() {
		return publisherID;
	}

	public String getCity() {
		return city;
	}



}
