package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :11:45:36 am
 *email :ridhima.gadalay@gmail.com
 */
public class PlayersList {

	private ArrayList<String> playerArray;
	private List<String> subList;

	//generic constructor to initialize the array List and list 
	public PlayersList() {
		
		playerArray = new ArrayList<>();
		subList = new ArrayList<>();
	}

	void addPlayer()
	{
		playerArray.add("Martina");  
		playerArray.add("Serena");
		playerArray.add("Venus");
		playerArray.add("Serena");
		playerArray.add("Sachin");
		playerArray.add("Dravid");
		playerArray.add("Ganguly");
		playerArray.add("Laxman");
		System.out.println();

	}

	void search() {
		System.out.println();
		System.out.println("************************************"
				+ "***********************");
		System.out.println("Search for an object and return "
				+ "the first and last position");
		System.out.println("*********************************"
				+ "***************************");
		System.out.println();
		System.out.println("First occurance of the String"
				+ " \"Serena\" is at position " + playerArray.indexOf("Serena"));
		System.out.println("Last occurance of the String"
				+ " \"Serena\" is at position  " + playerArray.lastIndexOf("Serena"));
		System.out.println();
	}

	void extract() {
		System.out.println("***************************"
				+ "*********************");
		System.out.println("Extract a sublist and "
				+ "then print the new List ");
		System.out.println("************************"
				+ "*************************");
		System.out.println();
		subList = playerArray.subList(4, playerArray.size());
		System.out.println("New Sub-List from index 4 to "
				+ playerArray.size() + " is : " + subList);
		System.out.println();
	}

	void display()
	{
		System.out.println("************ Display Players using Iterator");
		Iterator<String> itr=playerArray.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
    }
}

