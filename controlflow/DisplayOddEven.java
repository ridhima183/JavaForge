package controlflow;

import java.util.Scanner;

/**
 * Author : Bhavna
 * Date : 06-Jul-2026
 * Time : 10:51:59 am
 * Program to display Odd & Even numbers in following format
 *
 * ODD      EVEN
 * ---      ----
 * 1        2
 * 3        4
 * 5        6
 * 7        8
 * 9        10
 */
public class DisplayOddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Range: ");
        int Range = scan.nextInt();

        System.out.println("ODD\tEVEN");
        System.out.println("---\t----");

        int odd = 1;
        int even = 0;

        while (odd <= Range && even <= Range + 1) {
            System.out.println(odd + "\t" + even);
            odd += 2;
            even += 2;
        }

        scan.close();
    }
}
