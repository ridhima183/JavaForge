package oopsdemo3;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :10:45:10 am
 *email :ridhima.gadalay@gmail.com
 */
public class Addition {

	//Java program to implement Method Overloading- Static PolyMorphism

	//  add() method is overloaded
	void add() 
	{
		System.out.println("Method Overloading Demo");
	}

	void add(int a,int b)
	{
		System.out.println("The Addition of 2 nos is :"+(a+b));
	}

	void add(double a,double b)
	{
		System.out.println("The Addition of 2 float nos is :"+(a+b));
	}

	void add(int a,int b, int c)
	{
		System.out.println("The Addition of 3 nos is :"+(a+b+c));
	}

	void add(String s1,String s2)
	{
		System.out.println("The Addition of 2 Strings is :"+(s1+s2));
	}


}
