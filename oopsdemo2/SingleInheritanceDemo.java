package oopsdemo2;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :3:19:59 pm
*email :ridhima.gadalay@gmail.com
*/
public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		
		// create objects of child class
		Developer d1 = new Developer(101, "James Gosling", "JDBC", "santender Bank"); //Invoke derived class constructor 
		Developer d2 = new Developer(102, "Rod Jhonson", "Spring Framework", "Virgin Atlantic");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106, "Mike"); //Invokes parent class constructor 
		e1.display();
	}

}
