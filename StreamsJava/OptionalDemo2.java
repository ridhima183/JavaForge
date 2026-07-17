package StreamsDemo;

import java.util.Optional;

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :4:35:51 pm
 *email :ridhima.gadalay@gmail.com
 */

class Customer1 {
	private String name;
	private String email;

	public Customer1(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}
public class OptionalDemo2 {
	
	public static void main(String[] args) {
		Customer1 customer1 = new Customer1("Ramesh", "ramesh@gmail.com");
		Customer1 customer2 = new Customer1("Suresh", null);

		System.out.println("Customer 1 Email:");
		System.out.println(customer1.getEmail().orElse("Email Not Available"));
		
		System.out.println("\nCustomer 2 Email:");
		System.out.println(customer2.getEmail().orElse("Email Not Available"));
		
	}

	

}
