package miscellaneous;
/**
*Author : Bhavna
*Date : 09-Jul-2026
*Time :4:42:13 pm
*email :ridhima.gadalay@gmail.com
*/
public class StringDemo {
	
	public static void main (String[] args) {
		//Program to create Strings using literals


		 // Compiler will check for the contents in string pool.
		        //If it exists new string is not created, It refers to the existing string
		        //If it doesnot exists a new String is created in String pool
		        String first="Java";
		        String second="Python";
		        String third="Programming";

		        System.out.println("The First String is : "+first);
		        System.out.println("The Second String is : "+second);

		        //String operations
		        System.out.println("The Length of Second String is : "+second.length());
		        System.out.println("The Joined String is : "+first.concat(third));
		        System.out.println("The Comparison of first & Second String : "+first.equals(second));// returns boolean value
	}

}
