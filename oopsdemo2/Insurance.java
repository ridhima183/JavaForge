package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :4:48:24 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Insurance {

	//Insurance → Parent class

	//LifeInsurance, HealthInsurance, VehicleInsurance → Child classes



	String policyHolderName;
	double premiumAmount;


	void setPolicyDetails(String name, double premium) {
		policyHolderName = name;
		premiumAmount = premium;
	}

	void displayPolicyDetails() {
		System.out.println("Policy Holder Name : " + policyHolderName);
		System.out.println("Premium Amount     : " + premiumAmount);
	}

}

class LifeInsurance extends Insurance{ 

	//Child class 

	int policyTerm;

	void setLifeInsuranceDetails(int term) {
		policyTerm = term;
	}

	void displayLifeInsuranceDetails() {
		super.displayPolicyDetails();
		System.out.println("Policy Term (Years): " + policyTerm);
	}
}

//Child class 2
class HealthInsurance extends Insurance {

	double coverageAmount;

	void setHealthInsuranceDetails(double coverage) {
		coverageAmount = coverage;
	}

	void displayHealthInsuranceDetails() {
		displayPolicyDetails();
		System.out.println("Coverage Amount    : " + coverageAmount);
	}
}


//Child class 3
class VehicleInsurance extends Insurance {

	String vehicleType;

	void setVehicleInsuranceDetails(String type) {
		vehicleType = type;
	}

	void displayVehicleInsuranceDetails() {
		displayPolicyDetails();
		System.out.println("Vehicle Type       : " + vehicleType);
	}
}



