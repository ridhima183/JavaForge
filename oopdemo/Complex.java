package oopdemo;
/**
*Author : Bhavna
*Date : 07-Jul-2026
*Time :12:39:04 pm
*email :ridhima.gadalay@gmail.com
*/
public class Complex {
	
	private double real;
	private double imaginary;

	
	//Generate constructor using fields
	
	public Complex(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) { //method which accepts object as an argument
		
		// c1.real +=c2.real
		//this keywords refers to current object calling the method 
		this.real += obj.real;
		this.imaginary+=obj.imaginary;
	}
	
	  public void display()
		{
			System.out.println("r"+this.real+" + i"+this.imaginary);
		}
	

}
