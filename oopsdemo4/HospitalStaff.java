package oopsdemo4;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :3:17:19 pm
*email :ridhima.gadalay@gmail.com
*/
public abstract class HospitalStaff {

		//Abstract class representing a general Hospital Staff member


		private String name;
		private String id;
		private String department;
		public HospitalStaff(String name, String id, String department) {
			super();
			this.name = name;
			this.id = id;
			this.department = department;
		}
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		
	    public String getDepartment() {
			return department;
		}


	   // Abstract method - must be implemented by subclasses
	   public abstract void performDuties();

	   // Concrete method - shared by all subclasses
	   public void attendMeeting() {
	       System.out.println(name + " is attending a hospital meeting.");
	   }
}

