package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :1:02:31 pm
 *email :ridhima.gadalay@gmail.com
 */
public class StaticDemo {

	public static void main(String[] args) { 

		Student s1=new Student(101,"Mike");
		Student s2=new Student(102,"John");
		Student s3=new Student(103,"Mary");

		s1.display();
		s2.display();
		s3.display();
		
		// invoke static method even before creating object
		Student.collegeChange(); 
		
		System.out.println("********* After changing college name **********");
		s1.display();
		s2.display();
		s3.display();
	}

}
