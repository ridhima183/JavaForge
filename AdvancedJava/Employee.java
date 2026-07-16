package newfeatures;
/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :2:29:28 pm
*email :ridhima.gadalay@gmail.com
*/
public class Employee {
		
		private int id;
	    private String name;
	    private String department;
	    private double salary;
	    private double rating;
	    
		public Employee(int id, String name, String department, double salary, double rating) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
			this.rating = rating;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getRating() {
			return rating;
		}
		public void setRating(double rating) {
			this.rating = rating;
		}
	    
	    
	}

