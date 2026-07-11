package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author : Bhavna 
 * Date : 06-Jul-2026 
 * Time : 2:10:55 pm 
 * email : ridhima.gadalay@gmail.com
 */
public class ArrayFunctionsClass {
    // FIXED: Changed parameter name from 'main' to 'args' to follow Java standards
    public static void main(String[] args) { 
        
        // Program to demonstrate various in-built Array Functions
        int[] n1 = {22, 45, 47, 12, 12, -2};
        int[] n2 = new int[5];
        int[] n3 = new int[n1.length];

        System.out.println("Array Contents of n1 without loop: " + Arrays.toString(n1));

        System.out.println("Display Array n1 elements with Enhanced For Loop:");
        for (int i : n1) {
            System.out.print(i + "\t");
        }
        System.out.println(); // Added to move to the next line after the loop

        // Arraycopy() method - copy entire array n1 to n3
        System.arraycopy(n1, 0, n3, 0, n1.length);
        System.out.println("n3 Array after Copying: " + Arrays.toString(n3));

        // Copy Array contents partially
        System.arraycopy(n1, 2, n2, 1, 3);
        System.out.println("n2 Array after Copying: " + Arrays.toString(n2));

        // Sort Array -- Uses Dual-Pivot Quicksort Algorithm
        Arrays.sort(n3);
        System.out.println("n3 Array after Sorting: " + Arrays.toString(n3));

        // Copying Small Arrays - copyOf() Function
        int[] copyOfn1 = Arrays.copyOf(n1, n1.length);
        System.out.println("New Array after copyOf() Function: " + Arrays.toString(copyOfn1));

        System.out.println("********** Binary Search **************");
        
        // Binary search requires a sorted array to work properly
        Arrays.sort(copyOfn1);
        System.out.println("New Array Contents (Sorted for Search): " + Arrays.toString(copyOfn1));

        // FIXED: Used try-with-resources to ensure the Scanner closes automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to be searched in Array: ");
            int num = scanner.nextInt();

            // Binarysearch() - Returns the index of the element. If not found, returns a negative value.
            // If the array has duplicates, it returns the index of any one occurrence.
            int index = Arrays.binarySearch(copyOfn1, num);

            if (index >= 0) {
                System.out.println("The Number " + num + " found at Index Position: " + index);
            } else {
                System.out.println("Element Not Found");
            }
        } 
    }
}
