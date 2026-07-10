package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :11:39:48 am
 *email :ridhima.gadalay@gmail.com
 */
class Bank // base class 
{
	private String name;
	public Bank(String name) {
		this.name = name;

	}
	int getRateOfInterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to "+name+" Bank");
	}
}

class SBI extends Bank {
	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
}

class ICICI extends Bank {
	public ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6;
	}		
}

class Axis extends Bank{
	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}
public class OverrideDemo {
	
	public static void main(String[] args) {
		
		SBI sbiBank = new SBI("SBI");
		ICICI ICICIBank = new ICICI("ICICI");
		Axis axisBank = new Axis("axis");
		
		sbiBank.display();
		System.out.println("the interest rate of SBI is: " +sbiBank.getRateOfInterest());
		
		ICICIBank.display();
		System.out.println("the interest rate of ICICI is: " +ICICIBank.getRateOfInterest());

		axisBank.display();
		System.out.println("the interest rate of Axis is: " +axisBank.getRateOfInterest());
	
	}

}
