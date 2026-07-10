package oopsdemo2;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :4:51:34 pm
*email :ridhima.gadalay@gmail.com
*/
public class HierarchialInheritanceDemo {
	
	public static void main(String[] args) {
		System.out.println();

	    HealthInsurance health = new HealthInsurance();
	    health.setPolicyDetails("Anita Sharma", 8000);
	    health.setHealthInsuranceDetails(500000);
	    System.out.println("----- Health Insurance -----");
	    health.displayHealthInsuranceDetails();

	    System.out.println();

	    VehicleInsurance vehicle = new VehicleInsurance();
	    vehicle.setPolicyDetails("Suresh Rao", 6000);
	    vehicle.setVehicleInsuranceDetails("Car");
	    System.out.println("----- Vehicle Insurance -----");
	    vehicle.displayVehicleInsuranceDetails();
	}	
}
