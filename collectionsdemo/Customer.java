package collectionsdemo;

import java.util.Objects;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :2:35:14 pm
*email :ridhima.gadalay@gmail.com
*/
public class Customer {
	
	private long id;
	private String name;
	private String city;
	
	//generate constructor
	
	public Customer(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	//generate hashcode and equals 

	@Override
	public int hashCode() {
		return Objects.hash(city, Long.valueOf(id), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}
	
	//generate toString()
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	//generate getters
	

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	
	
	
	
	
	
	

}
