package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :3:16:00 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Developer extends Employee{

	private String skillSet;
	private String projectName;

	//generate constructor using fields

	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name); //calls parent class constructor  
		this.skillSet = skillSet;
		this.projectName = projectName;
	}

	// method to display developer details
	public void displayDeveloperDetails() {
		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}

}
