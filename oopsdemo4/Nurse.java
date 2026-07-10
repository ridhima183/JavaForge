package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :3:30:31 pm
 *email :ridhima.gadalay@gmail.com
 */


public class Nurse extends HospitalStaff {

	private int patientLoad;

	public Nurse(String name, String id, String department, int patientLoad) {
		super(name, id, department);
		this.patientLoad = patientLoad;
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is caring for " + patientLoad + 
				" patients in the " + getDepartment() + " department.");

	}             

	public void administerMedication() {
		System.out.println(getName() + " is administering medication to patients.");
	}
}


