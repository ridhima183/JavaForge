package controlflow;

import java.util.Scanner;

/**
* Author : bhavna
* Date : Jul 4, 2026
* Time : 11:44:12 AM
* Email : ridhima.gadalay@gmail.com
* Java Program to demonstrate the Student Result Management System. 
* This program allows you to input student details, calculate their results based on 
* marks obtained in various subjects, and display the final result with grade .
*/

public class StudentResult {
	
	public static void main(String[] args) {
		
		//Declarations
		int rollNumber;
		String firstName, grade;
		float marks1, marks2, marks3, marks4, marks5, total, percentage;
		Scanner scan = new Scanner(System.in);

		//Input
		System.out.println("Enter Name of Student & Roll Number :");
		firstName = scan.next();
		rollNumber = scan.nextInt(); 
		
		System.out.println("Enter Marks of 5 Subjects");
		
		System.out.println("Subject 1 : ");
		marks1 = scan.nextFloat(); // Changed to nextFloat() to match data type

		System.out.println("Subject 2 : ");
		marks2 = scan.nextFloat();
		
		System.out.println("Subject 3 : ");
		marks3 = scan.nextFloat();
		
		System.out.println("Subject 4 : ");
		marks4 = scan.nextFloat();
		
		System.out.println("Subject 5 : ");
		marks5 = scan.nextFloat();
		
		//Calculate Total marks and percentage
		total = marks1 + marks2 + marks3 + marks4 + marks5;
		percentage = total / 5;
		
		// Logic changes made here to fix the syntax error and eliminate grade gaps
		if (percentage >= 85) { // Fixed: added missing ')' and changed to >= to include 85
			grade = "Distinction";
		}
		else if (percentage >= 60) { // Cleaned up: if it's not 85+, we just check if it's 60+
			grade = "First Class";
		}
		else if (percentage >= 40) { 
			grade = "Second Class";
		}
		else if (percentage >= 18) { 
			grade = "Third Class";
		}
		else {
			grade = "Fail";
		}

		//Display
		System.out.println("********** Student Information **********");
		System.out.println("Roll Number          : " + rollNumber);
		System.out.println("Student\tName        : " + firstName);
		System.out.println("Student\tMarks       : " + marks1 + " " + marks2 + " " + marks3 + " " + marks4 + " " + marks5);
		System.out.println("Total \"Marks\"      : " + total);
		System.out.println("------------------------------------------");
		System.out.println("\\\\Percentage       : " + String.format("%.2f", percentage));
		System.out.println("\\\\Percentage       : " + percentage);
		System.out.println("\\\\Grade            : " + grade);
		System.out.println("******************************************");
		
		scan.close();
	}
}
