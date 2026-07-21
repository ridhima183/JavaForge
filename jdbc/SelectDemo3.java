package jdbcdemo;
import java.sql.*;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 12:08:40 PM
 * Email : sirinandini.a@gmail.com
 */

public class SelectDemo3 {

	// Database credentials
	private static final String URL = "jdbc:mysql://localhost:3306/classicmodels"; 
	private static final String USER = "root";  
	private static final String PASSWORD = "Siri789";  


	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Step 1: Load MySQL JDBC Driver (optional for JDBC 4.0+, but safer)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("✅ MySQL Driver Loaded Successfully.");

			// Step 2: Establish Connection
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("✅ Connected to Database Successfully.");

			// Step 3: Create Statement
			stmt = conn.createStatement();

			// Step 4: Execute Query
			//Projection
			String sql = "SELECT productCode,productName,productLine,quantityInStock FROM products order by productLine";
			rs = stmt.executeQuery(sql);

			System.out.println("------ Customer Records ------");

			// Step 5: Process ResultSet
			while (rs.next()) {
				String id = rs.getString("productCode");
				String name = rs.getString("productName");
				String line = rs.getString(3);
				int qty = rs.getInt(4);

				System.out.printf("ProductCode: %s | Product Name: %s | ProductLine: %s | "
						+ "CreditLimit: %d%n",id, name, line, qty);            }
		}    catch (Exception e) {
			System.out.println("❌ Database operation failed.");
			e.printStackTrace();
		} finally {
			// Step 6: Close resources manually
			try {
				if (rs != null) rs.close();   if (stmt != null) stmt.close();  if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("✅ Resources Closed."); } 
	}

}
