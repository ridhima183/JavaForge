package oopsdemo4;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :4:34:19 pm
*email :ridhima.gadalay@gmail.com
*/
public class Circle implements EyeShape{
	
	private double radius;
	
	//generate constructor 
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//generate getters 
	public double getRadius() {
		return radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle with radius: " + radius);
		
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius ;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}	

}
