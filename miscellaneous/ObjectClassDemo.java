package miscellaneous;
/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :10:15:29 am
 *email :ridhima.gadalay@gmail.com
 */
public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Employee objects
		Employee emp1 = new Employee(101, "Alice", 50000);
		Employee emp2 = new Employee(101, "Alice", 50000);
		Employee emp3 = new Employee(102, "Bob", 60000);

		// toString()
		System.out.println("emp1 details: " + emp1);

		// invokes equals()
		System.out.println("emp1 equals emp2? " + emp1.equals(emp2));
		System.out.println("emp1 equals emp3? " + emp1.equals(emp3));

		// hashCode()
		System.out.println("emp1 hashCode: " + emp1.hashCode());
		System.out.println("emp2 hashCode: " + emp2.hashCode());
		System.out.println("emp3 hashCode: " + emp3.hashCode());

		// getClass()
		System.out.println("Class of emp1: " + emp1.getClass().getName());

	}

}
