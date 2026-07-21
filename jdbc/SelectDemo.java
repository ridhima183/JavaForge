package jdbcdemo;
import java.sql.*;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 11:41:29 AM
 * Email : sirinandini.a@gmail.com
 * Java Program to demonstrate how to connect to a MySQL database using JDBC, 
 * execute a SELECT query, and display the results.
 */

public class SelectDemo {

	public static void main(String[] args) {

		// db parameters
		final String url       = "jdbc:mysql://localhost:3306/mysqljdbc";
		final String user      = "root";
		final String password  = "Siri789";

		try {
			//step 1- Load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step 2- Create a connection object and connect to database mysqljdbc
			Connection con = DriverManager.getConnection(url,user,password);

			//step 3- create an statement object
			Statement stmt = con.createStatement();

			// Execute Query & store records in result set
			// ResultSet is a virtual table
			// By Default ResultSet is Non-SCrollable
			ResultSet rs = stmt.executeQuery("select * from candidates");

			//Step5 - Traversing in ResultSet & display records
			while(rs.next())
				System.out.print(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)
				+"\t\t"+rs.getDate(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6));

			//step 6- close the connection
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);

		}

	}

}
