package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Author : Bhavna
 * Date : Jul 4, 2026
 * Time : 4:01:11 PM
 * Email : ridhima.gadalay@gmail.com
 * Java program to check if the user is eligible for a discount or not.
 * If the user's age is less than 18 or they are not a member,
 * they are eligible for a discount.
 * Otherwise, they are not eligible for a discount.
 */

public class Discount {

    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String name;
        int age;
        boolean isMember;

        // Ask user for details
        System.out.println("Enter Your Name:");
        name = br.readLine();

        System.out.println("Enter Your Age:");
        age = Integer.parseInt(br.readLine());

        System.out.println("Are You a Member? (true/false)");
        isMember = Boolean.parseBoolean(br.readLine());

        // Check eligibility
        if (age < 18 || !isMember) {
            System.out.println(name + " is Eligible for Discount");
        } else {
            System.out.println(name + " is NOT Eligible for Discount");
        }

        br.close();
    }
}