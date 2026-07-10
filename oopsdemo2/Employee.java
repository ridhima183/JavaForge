package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :3:13:33 pm
 *email :ridhima.gadalay@gmail.com
 *Single inheritance demonstration 
 */
public class Employee {

	private int empId;
	private String name;

	// generate constructors using fields 

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	void display()
	{
		System.out.println("********** Employee Details ***************");
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+name);
	}


}
