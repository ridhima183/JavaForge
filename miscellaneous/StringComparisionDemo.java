package miscellaneous;
/**
 *Author : Bhavna
 *Date : 09-Jul-2026
 *Time :4:50:52 pm
 *email :ridhima.gadalay@gmail.com
 */
public class StringComparisionDemo {

	public static void main(String[] args) {
		String s1="James Gosling";
		String s2="James Gosling";
		//String s2="James gosling";

		String s3=new String("Hello World");
		String s4=new String("Hello World");

		if(s1==s2) // == operator Checks whether Strings points to same reference
		{

			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings are Not Equal");
		}

		if(s3.equals(s4)) //equals() method checks whether String contents are equal

			System.out.println("Strings Are Equal");
		else
			System.out.println("Strings Are Not Equal");
	}

}
