package newfeatures;

import java.util.function.BiConsumer;

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :12:13:06 pm
 *email :ridhima.gadalay@gmail.com
 */

//Program to demonstrate Method reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation{
	void addition(Integer  a,Integer b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}
public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c1 = new Calculation();
		
		//using lambda expressions
		IDemo d1 = (a,b) -> System.out.println("The Additon is : " +(a+b));
		d1.sum(10,45);
		
		//using method reference to call instance method
		IDemo d2 = c1::addition;
		d2.sum(200, 150);
		d2.sum(700, 350);
		
		//Using java built-in Functional Interface Biconsumer
		BiConsumer<Integer,Integer>d3=c1::addition;
		d3.accept(500, 250);
		d3.accept(800, 450);
	}

}
