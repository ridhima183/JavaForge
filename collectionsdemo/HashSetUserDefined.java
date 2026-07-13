package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :2:35:14 pm
*email :ridhima.gadalay@gmail.com
*/

public class HashSetUserDefined {
	Set<Customer> customers;
	public  HashSetUserDefined(){
		System.out.println("hashset with  customer object");
		customers=new HashSet<>();
		
	}
	void addCustomer()
	{
		// add new Customer Object to set
		customers.add(new Customer(101,"Arun","Bengaluru"));
		customers.add(new Customer(102,"Mike","Newyork"));
		customers.add(new Customer(103,"John","Sydney"));
		customers.add(new Customer(104,"Hari","Delhi"));
		customers.add(new Customer(105,"Navi","Mumbai"));
	}
	
	void appendCustomer()
	{
		// add duplicate customer	
		/*
		        HashSet will use the `equals()` & `hashCode()` implementations 
		        of the Customer class to check for duplicates and ignore them
		 */
		customers.add(new Customer(103,"John","Sydney"));
		customers.add(new Customer(106,"Raj","Chennai"));
	}
	
	void displayCustomers()
	{
		System.out.println(" ********* Customer List *****************");
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
		System.out.println("------------------------------------------");
		System.out.println("Total Customers :"+customers.size());
	}
	public static void main(String[] args) {
		
		HashSetUserDefined custHset = new HashSetUserDefined();
		custHset.addCustomer();
		custHset.appendCustomer();
		custHset.displayCustomers();
	}

}
