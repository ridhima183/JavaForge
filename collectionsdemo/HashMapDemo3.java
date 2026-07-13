package collectionsdemo;

import java.util.HashMap;
import java.util.Map.Entry;

/**
*Author : Bhavna
*Date : 10-Jul-2026
*Time :4:19:32 pm
*email :ridhima.gadalay@gmail.com
*/
public class HashMapDemo3 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
		
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    
	    System.out.println("HashMap: " + languages);
	    
	 // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    System.out.println("Value at index 3: " + languages.get(3));
	    
	    // return set of keys
	    System.out.println("Keys :"+languages.keySet());
	    
	    //return set of values
	    System.out.println("Values: "+languages.values());
	    
	    // return set of key-value pairs
	    System.out.println("Key-Value Mappings : "+languages.entrySet());
	    
	    languages.replace(2, "C++");
	    
	    // Iterate tru keys -- keyset()
	    System.out.println("Keys: ");
	    for(Integer k:languages.keySet())
	    {
	    	System.out.println(k+"-->"+languages.get(k));
	    }
	    
	    // Iterate tru key-value pairs -- entryset()
	    System.out.println("Entries: ");
	    for(Entry<Integer, String> entry:languages.entrySet())
	    {
	    	System.out.println(entry);
	    }
	}
	}
