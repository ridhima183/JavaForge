package collectionsdemo;
/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :12:47:17 pm
 *email :ridhima.gadalay@gmail.com
 */

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListdemo3 {

	public static void main(String[] args) {

		LinkedList<Double> stockPrices = new LinkedList<>();

		// A LinkedList containing Stock Prices of a company for the last 6 days
		stockPrices.add(45.00);
		stockPrices.add(51.00);
		stockPrices.add(62.50);
		stockPrices.add(42.75);
		stockPrices.add(36.80);
		stockPrices.add(68.40);

		System.out.println(stockPrices); 

		Collections.sort(stockPrices);

		System.out.println(stockPrices);

		Collections.reverse(stockPrices);
		System.out.println(stockPrices);

		System.out.println("Max Stock Price :"+Collections.max(stockPrices));
		System.out.println("Min Stock Price :"+Collections.min(stockPrices));

	}

}


