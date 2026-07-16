package newfeatures;

import java.util.Collections;
import java.util.ArrayList; 
import java.util.List; 

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :11:30:41 am
 *email :ridhima.gadalay@gmail.com
 */
public class LambdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Real-time example is sorting employees using Collections.sort() with a lambda.


		List<Trainee> empList = new ArrayList<>();

		empList.add(new Trainee(101, "Raj", 45000));
		empList.add(new Trainee(102, "Anjali", 65000));
		empList.add(new Trainee(103, "Kiran", 38000));
		empList.add(new Trainee(104, "Priya", 72000));

		// Lambda Expression without Stream API
		//Lambda Expression passed as an argument to another function sort()
		Collections.sort(empList,(e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

		System.out.println("Employees sorted by salary:");

		for (Trainee emp : empList) {
			System.out.println(emp);
		}


	}

}
