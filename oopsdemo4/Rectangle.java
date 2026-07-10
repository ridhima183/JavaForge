package oopsdemo4;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :4:39:19 pm
*email :ridhima.gadalay@gmail.com
*/
public class Rectangle implements EyeShape{
	
	private double width;
	private double height;
	
	//generate constructors 
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		 System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
		
	}
	@Override
	public double getArea() {
		return this.height*this.width;
	
	}
	@Override
	public double calculatePerimeter() {		
		  return 2*(this.height+this.width);

	}

}
