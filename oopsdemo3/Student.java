package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :12:59:24 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Student {

	private int rollNo;
	private String name;
	private static String college="CBIT"; // static field"; 

	//constructor 

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	static void collegeChange() //static method
	{
		college="RVCE";
		//rollNo=101; // static methods can use only static fields
	}

	void display()
	{
		System.out.println(rollNo+" "+name+" "+college);
	}

}
