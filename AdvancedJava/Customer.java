package newfeatures;

/**
 *Author : Bhavna
 *Date : 14-Jul-2026
 *Time :12:15:00 pm
 *email :ridhima.gadalay@gmail.com
 */
public class Customer {
	private String name;
	private int age;

	// Constructor to initialize name and age
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter method for Name
	public String getName() {
		return name;
	}

	// Getter method for Age
	public int getAge() {
		return age;
	}

	// Setter method for Name (Optional)
	public void setName(String name) {
		this.name = name;
	}

	// Setter method for Age (Optional)
	public void setAge(int age) {
		this.age = age;
	}
}

