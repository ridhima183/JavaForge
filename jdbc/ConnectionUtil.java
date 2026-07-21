package jdbcdemo;
import java.sql.*;
/**
* Author : sirin
* Date : Jul 13, 2026
* Time : 12:30:56 PM
* Email : sirinandini.a@gmail.com
*/


//Utility class to create connection with MySQL database
public class ConnectionUtil {

	public static Connection createConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Siri789");
		return con;
	}
}
