package oopdemo;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :12:08:23 pm
*email :ridhima.gadalay@gmail.com
*method - 1 : main and instance in different files 
*method - 2 : main and instance in the same file 
*method - 3 : main and instance in the same main class
*/
public class ConstructorDemo {
	
	private int id;
	private String name;
	private float salary;
	
	//Generate constructors using fields
	
	public ConstructorDemo() {
		System.out.println("i am implicit constructor");
		this.id=101;
		this.name="Alice";
		this.salary=7000.00f;
	}
	 //generate constructor with arguments 
	//source menu --> generate constructor using fields 
	//--> select all --> generate Button

	public ConstructorDemo(int id, String name, float salary) {
		System.out.println("i am parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(this.id+ " "+this.name+" "+this.salary);
	}

	public static void main(String[] args) {
		ConstructorDemo cd1=new ConstructorDemo(); // invokes implicit Constructor
		ConstructorDemo cd2=new ConstructorDemo(102,"John",6000.00f); // invoke parameterized constructor
		ConstructorDemo cd3=new ConstructorDemo(103,"Gavin",5000.00f); // invoke parameterized constructor
		
		ConstructorDemo cd4=new ConstructorDemo();
		ConstructorDemo cd5=new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
		cd4.display();
		cd5.display();
		
		ConstructorDemo cd6=new ConstructorDemo();
		cd6.display();
	}
	
	

}
