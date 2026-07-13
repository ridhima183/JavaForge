package collectionsdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Author : Bhavna 
 * Date : 10-Jul-2026 
 * Time :3:08:17 pm 
 * email :ridhima.gadalay@gmail.com
 */
public class Onlineshopping {

	// Helper method to look up a product in the HashSet by ID
	private static Product findProduct(HashSet<Product> productSet, int id) {
		for (Product p : productSet) {
			if (p.getProductId() == id) {
				return p;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("=== ONLINE SHOPPING SYSTEM USING HASHSET & TREESET ===\n");

		// 1️⃣ HashSet: Store unique products (unordered)
		HashSet<Product> productSet = new HashSet<>();

		// Add sample products
		productSet.add(new Product(103, "Wireless Mouse", 799.99));
		productSet.add(new Product(101, "Laptop", 55000.00));
		productSet.add(new Product(104, "Headphones", 1299.50));
		productSet.add(new Product(102, "Smartphone", 24999.00));

		System.out.println("All Products (HashSet - Unordered):");
		for (Product p : productSet)
			System.out.println(p);

		// 2️⃣ TreeSet: Sort products by Product ID using Comparator
		TreeSet<Product> sortedProducts = new TreeSet<>(Comparator.comparingInt(Product::getProductId));
		sortedProducts.addAll(productSet);

		System.out.println("\nAll Products (TreeSet - Sorted by Product ID):");
		for (Product p : sortedProducts)
			System.out.println(p);

		// 3️⃣ Data Manipulation (CRUD operations)
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n--- ONLINE SHOPPING MENU ---");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3. Search Product");
			System.out.println("4. Update Price");
			System.out.println("5. Display All (Sorted)");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Product ID: ");
				int pid = sc.nextInt();
				sc.nextLine(); // consume newline
				System.out.print("Enter Product Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Price: ");
				double price = sc.nextDouble();
				
				Product newProd = new Product(pid, name, price);
				if (productSet.add(newProd)) {
					System.out.println("✅ Product added successfully!");
				} else {
					System.out.println("⚠️ Product ID already exists! Cannot add duplicate.");
				}
				break;

			case 2:
				System.out.print("Enter Product ID to remove: ");
				int remId = sc.nextInt();
				Product toRemove = findProduct(productSet, remId);
				if (toRemove != null) {
					productSet.remove(toRemove);
					System.out.println("🗑️ Product removed successfully!");
				} else {
					System.out.println("❌ Product not found!");
				}
				break;

			case 3:
				System.out.print("Enter Product ID to search: ");
				int searchId = sc.nextInt();
				Product found = findProduct(productSet, searchId);
				if (found != null)
					System.out.println("✅ Product Found: " + found);
				else
					System.out.println("❌ Product not found!");
				break;

			case 4:
				System.out.print("Enter Product ID to update price: ");
				int updId = sc.nextInt();
				Product updProd = findProduct(productSet, updId);
				if (updProd != null) {
					System.out.print("Enter new price: ");
					double newPrice = sc.nextDouble();
					updProd.setPrice(newPrice);
					System.out.println("💰 Price updated successfully! New details: " + updProd);
				} else {
					System.out.println("❌ Product not found!");
				}
				break;

			case 5:
				sortedProducts = new TreeSet<>(Comparator.comparingInt(Product::getProductId));
				sortedProducts.addAll(productSet);
				System.out.println("\n🛍️ All Products (Sorted by Product ID):");
				for (Product p : sortedProducts)
					System.out.println(p);
				break;

			case 6:
				running = false;
				System.out.println("👋 Thank you for shopping with us!");
				break;

			default:
				System.out.println("⚠️ Invalid choice! Please try again.");
			}
		}
		sc.close();
	}
}
