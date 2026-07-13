package collectionsdemo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :3:51:22 pm
 *email :ridhima.gadalay@gmail.com
 */
public class HashMapDemo1 {

	public static void main(String[] args) {

		HashMap<String,Double> hm = new HashMap<>();

		hm.put("John",5000.50);
		hm.put("Mike",4500.50);
		hm.put("Jack",5780.50);
		hm.put("Daisy",5900.50);
		hm.put("Jim",23460.50);

		System.out.println("display Customers & Balance Amount : ");
		for (String k:hm.keySet())
		{
			System.out.println(k+"-->"+hm.get(k));
		}

		// deposit 1000 to Jim's Account- Update value
		double bal=hm.get("Jim");
		hm.put("Jim",bal+1000);
		System.out.println("Jim's new Balance is :"+hm.get("Jim"));

		hm.putIfAbsent("Raj", 500.00);

		System.out.println(hm);

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name for his Balance :");
		String name=s.next();
		System.out.println("The Balance of "+name+ " is :"+hm.get(name));
		
		s.close();
	}

}
