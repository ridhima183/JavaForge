package oopsdemo2;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :9:43:08 am
*email :ridhima.gadalay@gmail.com
*/
public class AggregationDemo {
	
	public static void main(String[] args ) {
		
		Address ad1=new Address("Bengaluru","Karnataka","India",566016);
		Address ad2=new Address("Prague","Bohemia","Czech Republic",77777);
		
    // Create Student objects and associate them with Address objects
		Student s1=new Student(101,"Ravi",ad1);
		Student s2=new Student(102,"Mike",ad2);
		
		s1.display();
		s2.display();

	}

}
