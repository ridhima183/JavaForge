package oopdemo;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :11:53:32 am
*email :ridhima.gadalay@gmail.com
*a special method to initialize values to the object is called a constructor
*avoids the usage of input, getter and setters
*/

class Pen{
	
	//properties/attributes of pen
	String colour;
	String type;
	
	//Constructor of pen class 
	Pen(){
		System.out.println("i am no args constructor"); // calls the default parameters 
		this.colour="red";
		this.type="fountain";
	}
	
	Pen(String colour, String type){ // if a different input is required use a parameterized constructor 
		System.out.println("i am parameterized constructor");
		this.colour=colour;
		this.type=type;
	}
	
	//method to display Pen properties 
	void display() {
		System.out.println("Pen colour: " +this.colour+", Pen Type:" +this.type);
	}
}
public class ConstructorTest {
	
	public static void main(String[] args) {
		
		Pen pen1 = new Pen(); // Invokes no args constructor 
		Pen pen2 = new Pen("Blue", "Ballpoint"); // Invokes parameterized constructor 
		Pen pen3 = new Pen("Black", "Gel"); // Invokes parameterized constructor 
		Pen pen4 = new Pen(); //dummy object invokes the no args constructor 	
		
		pen1.display();
		pen2.display();
		pen3.display();
		
		pen4.display();
		
		
	}

}
