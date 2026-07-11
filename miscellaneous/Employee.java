package miscellaneous;

import java.util.Objects;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :10:10:04 am
*email :ridhima.gadalay@gmail.com
*/
public class Employee {
	
	private int id;
	private String name;
	private double salary;

	//generate constructors
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//generate toString()
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name, Double.valueOf(salary));
	}
	
	//generate equals and hashCode

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	//generate clone method
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	

}
