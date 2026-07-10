package oopdemo;
/**
*Author : Bhavna
*Date : 06-Jul-2026
*Time :4:53:01 pm
*email :ridhima.gadalay@gmail.com
*/
public class CoforgeEmployeeTest { 
	
	public static void main(String[] args) {
		
		//create Objects e1,e2,e3 of employee class
		Employee developer = new Employee();
		Employee tester = new Employee();
		Employee sales = new Employee();
		
		// invoke methods(method call)
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();
		
	
	}

}
