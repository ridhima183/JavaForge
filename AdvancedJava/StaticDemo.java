package newfeatures;
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :2:36:50 pm
 *email :ridhima.gadalay@gmail.com
 *In Java, static import concept is introduced in 1.5 version. 
 * With the help of static import, we can access the static members 
 * of a class directly without class name or any object. 
 * For Example: we always use sqrt() method of Math class by 
 * using Math class i.e. Math.sqrt(), 
 * but by using static import we can access sqrt() method directly. 
 */
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling of predefined methods without static import
				System.out.println(Math.sqrt(4));
		        System.out.println(Math.pow(2, 2));
		        System.out.println(Math.abs(6.3));
		        
		     // calling of predefined methods with static import
		        out.println(sqrt(4));
		        out.println(pow(2,2));
		        out.println(abs(6.3));

	}

}


