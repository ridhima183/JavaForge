package jdbcdemo;
import java.sql.*;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 2:05:45 PM
 * Email : sirinandini.a@gmail.com
 */

public class JoinDemo2 {
	private static final String URL ="jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER = "root";
	private static final String PASSWORD = "Siri789";

	// """ is used for multi-line  strings in Java 15+
	private static final String SQL = """
			SELECT 
			    c.customerNumber,
			    c.customerName,
			    c.city,
			    c.country,
			    o.orderNumber,
			    o.orderDate,
			    o.status
			FROM customers c
			LEFT JOIN orders o
			ON c.customerNumber = o.customerNumber
			""";


	public static void main(String[] args) {

		// Try-With-Resources automatically closes Connection		- Java 1.5
		try (
				Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement ps = con.createStatement();
				ResultSet rs = ps.executeQuery(SQL);
				) {

			System.out.println(
					"CustNo  | Customer Name        | City        | Country     | OrderNo | Order Date | Status");
			System.out.println(
					"--------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.printf(
						"%-7d | %-20s | %-11s | %-11s | %-7d | %-10s | %-10s%n",
						rs.getInt("customerNumber"),
						rs.getString("customerName"),
						rs.getString("city"),
						rs.getString("country"),
						rs.getInt("orderNumber"),
						rs.getDate("orderDate"),
						rs.getString("status")
						);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
