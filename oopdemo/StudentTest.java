package oopdemo;

/**
 * Author : Bhavna
 * Date : Jul 6, 2026
 * Time : 4:19:48 PM
 * Email : ridhima.gadalay@gmail.com
 */

public class StudentTest{
	public static void main(String[] args) {
		//Create student object 
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//Invoke instance class methods using dot operator 
		s1.inputStudentDetails();
		s2.inputStudentDetails();
		s3.inputStudentDetails();
		
		float tot1=s1.calculateTotalMarks();
		float tot2=s2.calculateTotalMarks();
		float tot3=s3.calculateTotalMarks();
		
		s1.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main : "+tot1);
		s2.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main : "+tot2);
		s3.displayStudentDetails();
		System.out.println("Display Total Marks returned to Main : "+tot3);
	}
}







