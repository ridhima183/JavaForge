package jdbcdemo;
import java.util.Scanner;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 4:28:00 PM
 * Email : sirinandini.a@gmail.com
 */

public class EmployeeCRUD {

	public static void main(String[] args) {
		Employee e=new Employee();
		String city=null,name=null,contactno=null;
		int eid=0;;

		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Employee Management System ----------");
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 to Update Email using RS.\t Press 6 to Display Employee By ID"); 
			System.out.println("Press 7 to Exit");

			
			int option=s.nextInt();

			switch(option)
			{
			case 1:
				System.out.println("Enter Employee Name:");
				name = s.next();

				System.out.println("Enter City:");
				city = s.next();

				System.out.println("Enter Contact:");
				contactno = s.next();

				e.insertEmployee(name, city, contactno);
				break;

			case 2: try {
				e.getEmployee();
			} catch (Exception e1) {

				e1.printStackTrace();
			}
			break;

			case 3:
				System.out.println("Enter Employee ID:");
				eid = s.nextInt();

				System.out.println("Enter New City:");
				city = s.next();

				e.updateEmployee(eid, city);
				break;

			case 4:
			    System.out.println("Enter Employee ID:");
			    eid = s.nextInt();

			    e.deleteEmployee(eid);
			    break;

			case 5:
			    System.out.println("Enter Employee Id for City Updation:");
			    e.updateEmployee(eid, city);
			    break;
				

			case 6:
			    System.out.println("Enter Employee ID:");
			    eid = s.nextInt();

			    e.getEmployeeByID(eid);
			    break;
			    
			    
			case 7: System.out.println("Program Terminated");
			System.exit(0);

			default: System.out.println("Invalid Selection");
			break;
			}

		}

	}

}
