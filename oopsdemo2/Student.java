package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :9:39:18 am
 *email :ridhima.gadalay@gmail.com
 */
public class Student {

	//Student has an Address - Unidirectional Relationship
	int rollNo;
	String name;

	// Entity Reference - Aggregation - HAS-A relationship
	Address ad;

	// FIX: Update constructor to accept and assign the Address field
	public Student(int rollNo, String name, Address ad) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.ad = ad; // Initializes the aggregation reference
	}

	void display()
	{
		System.out.println("---------- Student Details ------------");
		System.out.println("Student Id   :" + rollNo);
		System.out.println("Student Name :" + name);

		// This will no longer throw a NullPointerException
		System.out.println("Address: " + ad.city + " " + ad.state + " " + ad.country + " " + ad.pincode);
	}
}
