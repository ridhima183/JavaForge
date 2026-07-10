package oopsdemo2;
/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :4:11:16 pm
 *email :ridhima.gadalay@gmail.com
 * Multi Level Inheritance Example
 */
public class Staff {

	private int empId;
	private String name;
	protected float salary,hra;

	// generate constructors using fields 

	public Staff(int empId, String name, float salary, float hra) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.hra = hra;
	}

	void getHRA()
	{
		hra=(salary*60)/100;
		System.out.println("HRA :"+hra);
	}

	void display()
	{
		System.out.println(empId+" "+name+" "+salary);
	}

	void print()
	{
		System.out.println("Gross Salary of Staff :"+(salary+hra));
	}

}

class Manager extends Staff{

	protected float da;
	private float gross;

	//generate constructor using fields 
	public Manager(int empId, String name, float salary, float hra) {
		super(empId, name, salary, hra);
	}

	void getDA()
	{
		da=(salary*80)/100;
		System.out.println("DA is : "+da);
	}

	void getGross()
	{
		gross= salary+hra+da;
		System.out.println("Gross Salary of Manager is :"+gross);
	}
}

class Director extends Manager{
	private float ta,gross;

	//Generate constructors using field 
	public Director(int empId, String name, float salary, float hra) {
		super(empId, name, salary, hra);
	}
	void getTA()
	{
		ta=(salary*30)/100;
		System.out.println("TA is :"+ta);
	}

	void getGross()
	{
		gross= salary+hra+da+ta;
		System.out.println("Gross Salary of Director is :"+gross);
	}


}
