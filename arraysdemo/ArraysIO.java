package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 06-Jul-2026
 *Time :12:44:40 pm
 *email :ridhima.gadalay@gmail.com
 */
public class ArraysIO {

	public static void main(String[] args) {

		int[] marks = {78,56,23,44,55,66,78,98,100,78,56,23,45,84};

		System.out.println("*************** Array of Marks ****************");
		for (int i = 0 ; i < marks.length; i++) {
			System.out.println(marks[i]+"\t");
		}

		System.out.println();
		System.out.println("the size of the array: " +marks.length);
		System.out.println("first element of array is :" +marks[0]);
		System.out.println("Last element of array :" +marks[marks.length-1]);

		//Enter Values to Array at Run-time
		System.out.println("****************************************************");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total no. of Students :");
		int n=scanner.nextInt();

		int marks2[]=new int[n]; // declare array & allocate memory of size n

		System.out.println("Enter Marks2 Array Elements  : ");
		for (int i = 0; i < n; i++) {
			marks2[i]=scanner.nextInt();
		}

		System.out.println("******** Marks2 Array Contents ***************");
		for (int i = 0; i < marks2.length; i++) {
			System.out.print(marks2[i]+" ");
		}
		System.out.println();
		System.out.println("Display Marks Array without Loop");
		System.out.println(Arrays.toString(marks));

		scanner.close();


	}

}
