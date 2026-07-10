package oopdemo;
/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :4:53:01 pm
*email :ridhima.gadalay@gmail.com
*/
public class EmployeeTest { 
	
	public static void main(String[] args) {
		
		//create Objects e1,e2,e3 of employee class
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		// invoke methods(method call)
		e1.inputEmployeeDetails();
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails();
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();
		
		e3.inputEmployeeDetails();
		e3.calculateNetSalary();
		e3.displayEmployeeDetails();
		
	
	}

}
