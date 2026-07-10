package oopsdemo4;
/**
*Author : Bhavna
*Date : 08-Jul-2026
*Time :4:41:18 pm
*email :ridhima.gadalay@gmail.com
*/
public class ShapeTest {
	
	public static void main(String[] args) {
		
		//programming for interfaces not implementation
		
		EyeShape shape = new Circle(10);// upcasting 
		
		System.out.println("Using Interface:" +EyeShape.LABEL);
		
		shape.draw();
		
		System.out.println("area of the circle with radius is:" +shape.getArea());
		
		//Switching from one implementation to another easily 
		shape = new Rectangle(10,7); //Upcasting
		
		shape.draw();
		System.out.println("area of the rectange is:" +shape.getArea());
			
	}

}
