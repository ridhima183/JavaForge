package controlflow;

import java.util.Scanner;

/**
 * Author : Ridhima
 * Date : Jul 4, 2026
 * Time : 12:49:01 PM
 * Email : ridhima.gadalay@gmail.com
 */

public class SingleDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        if (num >= -9 && num <= 9) {
            System.out.println(num + " is a Single Digit.");
        } else {
            System.out.println(num + " is NOT a Single Digit.");
        }

        scan.close();
    }
}