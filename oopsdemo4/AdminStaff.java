package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :3:25:34 pm
 *email :ridhima.gadalay@gmail.com
 */
public class AdminStaff extends HospitalStaff{


	private String role;

	public AdminStaff(String name, String id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}
	@Override
	public void performDuties() {

		System.out.println(getName() + " is performing " + role + 
				" tasks in the " + getDepartment() + " department.");

	}

	public void processPaperwork() {
		System.out.println(getName() + " is processing hospital paperwork.");
	}

}

