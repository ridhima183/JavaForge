package jdbcdemo;
import java.sql.*;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 11:53:05 AM
 * Email : sirinandini.a@gmail.com
 */

public class SelectDemo2 {
	public static void main(String[] args) {

		// db parameters
		final String url       = "jdbc:mysql://localhost:3306/gym";
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
			ResultSet rs = stmt.executeQuery("select * from members");

			//Step5 - Traversing in ResultSet & display records
			while (rs.next()) {
			    System.out.println(
			        rs.getInt(1) + "\t\t" +
			        rs.getString(2) + "\t\t" +
			        rs.getString(3) + "\t\t" +
			        rs.getString(4) + "\t\t" +
			        rs.getInt(5) + "\t" +
			        rs.getString(6) + "\t" +
			        rs.getDate(7) + "\t" +
			        rs.getInt(8) + "\t" +
			        rs.getInt(9) + "\t" +
			        rs.getString(10) 
			    );
			}

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
