package collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :4:17:27 pm
 *email :ridhima.gadalay@gmail.com
 */
public class BloggingSystem {

	public static void main(String[] args) {

		/*Java Program to demonstrate the use of HashMap and TreeMap in a Blogging domain & perform
		 * CRUD Operations
		 */

		Scanner sc = new Scanner(System.in);

		// 1️⃣ HashMap - Unordered storage
		HashMap<Integer,Blog> blogMap = new HashMap<Integer, Blog>();

		// Add some initial blogs
		blogMap.put(101, new Blog(101, "Intro to Java", "Ravi", "Java basics for beginners."));
		blogMap.put(103, new Blog(103, "Spring Boot Guide", "Priya", "Step-by-step Spring Boot tutorial."));
		blogMap.put(102, new Blog(102, "Frontend Trends", "Anita", "Exploring 2025 frontend frameworks."));

		boolean running = true;
		while (running) {
			System.out.println("\n=== BLOGGING SYSTEM MENU ===");
			System.out.println("1. Add Blog");
			System.out.println("2. Update Blog");
			System.out.println("3. Delete Blog");
			System.out.println("4. Search Blog");
			System.out.println("5. Display All (HashMap - Unordered)");
			System.out.println("6. Display All (TreeMap - Sorted by Blog ID)");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Blog ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Title: ");
				String title = sc.nextLine();
				System.out.print("Enter Author: ");
				String author = sc.nextLine();
				System.out.print("Enter Content: ");
				String content = sc.nextLine();

				if (blogMap.containsKey(id)) {
					System.out.println("❌ Blog with ID " + id + " already exists!");
				} else {
					blogMap.put(id, new Blog(id, title, author, content));
					System.out.println("✅ Blog added successfully!");
				}
				break;

			case 2:
				System.out.print("Enter Blog ID to update: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				Blog updateBlog = blogMap.get(updateId);
				if (updateBlog != null) {
					System.out.print("Enter new Title: ");
					String newTitle = sc.nextLine();
					System.out.print("Enter new Content: ");
					String newContent = sc.nextLine();
					updateBlog.setTitle(newTitle);
					updateBlog.setContent(newContent);
					System.out.println("✅ Blog updated successfully!");
				} else {
					System.out.println("❌ Blog not found!");
				}
				break;

			case 3:
				System.out.print("Enter Blog ID to delete: ");
				int deleteId = sc.nextInt();
				if (blogMap.remove(deleteId) != null) {
					System.out.println("🗑️ Blog deleted successfully!");
				} else {
					System.out.println("❌ Blog not found!");
				}
				break;

			case 4:
				System.out.print("Enter Blog ID to search: ");
				int searchId = sc.nextInt();
				Blog found = blogMap.get(searchId);
				if (found != null) {
					System.out.println("✅ Blog Found: " + found);
				} else {
					System.out.println("❌ Blog not found!");
				}
				break;

			case 5:
				System.out.println("\n📰 All Blogs (HashMap - Unordered):");
				for (Map.Entry<Integer, Blog> entry : blogMap.entrySet()) {
					System.out.println(entry.getValue());
				}
				break;

			case 6:
				TreeMap<Integer, Blog> sortedMap = new TreeMap<Integer, Blog>(blogMap);
				System.out.println("\n📚 All Blogs (TreeMap - Sorted by Blog ID):");
				for (Map.Entry<Integer, Blog> entry : sortedMap.entrySet()) {
					System.out.println(entry.getValue());
				}
				break;

			case 7:
				running = false;
				System.out.println("👋 Exiting Blogging System. Goodbye!");
				break;

			default:
				System.out.println("⚠️ Invalid choice! Try again.");
			}
		}

		sc.close();
	}

}
