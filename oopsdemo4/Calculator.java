package oopsdemo4;

import java.util.Scanner;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :9:27:57 am
 *email :ridhima.gadalay@gmail.com
 */
public class Calculator implements IMath {

	Scanner kb;

	@Override
	public void add() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform Subtraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("SUbtraction of "+a+" and "+b+" is "+s);

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform Multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("Mul of "+a+" and "+b+" is "+s);


	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform Division");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("Div of "+a+" and "+b+" is "+s);



	}
	void display()
	{
		System.out.println("My Calculator - Designed by Raj");
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		c1.display();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}



}
