package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :11:29:15 am
*email :ridhima.gadalay@gmail.com
*/
public class Trainee {

	private int id; 
	private String name;
	private double salary;
	
	
	public Trainee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public double getSalary() {
		return salary;
	}



	@Override
	public String toString() {
		return "trainee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
