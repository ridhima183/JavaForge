package oopsdemo4;
/**
 *Author : Bhavna
 *Date : 08-Jul-2026
 *Time :4:32:44 pm
 *email :ridhima.gadalay@gmail.com
 */
public interface EyeShape {

	//implicitly public, static and final - constant
	public String LABEL="Shape";

	//interface methods are implicitly abstract and public
	void draw();

	public abstract double getArea();
	public abstract double calculatePerimeter();

}
