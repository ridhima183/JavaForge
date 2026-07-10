package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :3:32:18 pm
 *email :ridhima.gadalay@gmail.com
 */

public class Doctor extends HospitalStaff{

	private String specialization;

	public Doctor(String name, String id, String department, String specialization) {
		super(name, id, department);
		this.specialization = specialization;
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is examining patients in the " + 
				getDepartment() + " department (" + specialization + ").");

	}   

	public void prescribeMedication() {
		System.out.println(getName() + " is writing a prescription.");
	}

}
