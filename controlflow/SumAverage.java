package controlflow;

import java.util.Scanner;

public class SumAverage {

    /*
     * Java program to find the sum and average of three numbers
     * using Scanner class for user input.
     */

    public static void main(String[] args) {

        // Variable Declaration
        int num1, num2, num3, sum;
        float average;

        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();

        System.out.print("Enter your name: ");
        String name = scanner.next();

        // Calculate sum and average
        sum = num1 + num2 + num3;
        average = sum / 3.0f;

        // Output
        System.out.println("Sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " = " + average);
        System.out.println("Program created by: " + name);

        // Close Scanner
        scanner.close();
    }
}