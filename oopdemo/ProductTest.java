package oopdemo;

import java.util.Scanner;

/**
 *Author : Bhavna
 *Date : 07-Jul-2026
 *Time :10:19:35 am
 *email :ridhima.gadalay@gmail.com
 */
public class ProductTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Product p1 = new Product();
		
		System.out.println("Enter the product details");
		
		System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        p1.setProductId(id);
        
        scanner.nextLine();
        
		System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        p1.setProductName(name);
        
        scanner.nextLine();
        
		System.out.print("Enter Product price: ");
        int price = scanner.nextInt();
        p1.setPrice(price);
        
        scanner.nextLine();
        
		System.out.print("Enter Product Quantity: ");
        int qt = scanner.nextInt();
        p1.setQuantity(qt);
        
        scanner.nextLine();
        
        p1.display();
        
        scanner.close();

		//invoke setter methods-input
//		p1.setProductId(101);
//		p1.setProductName("hp laptop");
//		p1.setPrice(35500);
//		p1.setQuantity(1); 
	}

}
