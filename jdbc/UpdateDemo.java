package jdbcdemo;
import java.sql.*;
import java.util.Scanner;

import com.sun.jdi.connect.spi.Connection;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 4:02:10 PM
 * Email : sirinandini.a@gmail.com
 */

public class UpdateDemo {

	Connection con;
	PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
	ResultSet rs;

	int cnt=0;
	String sqlUpdate;
	Scanner s;
	int eid;
	String newLastname;

	public void getConnection() throws Exception
	{
		con=(Connection) ConnectionUtil.createConnection();
	}

	public void UpdateCandidate() throws Exception
	{
		sqlUpdate="UPDATE candidates SET last_name = ? WHERE id = ?";

		pstmt=((java.sql.Connection) con).prepareStatement(sqlUpdate);

		// prepare data for update
		s=new Scanner(System.in);
		System.out.println("enter Employee id:");
		eid=s.nextInt();
		System.out.println("enter employee's new last name :");
		newLastname=s.next();

		// passing values to prepared statement using setter methods
		pstmt.setString(1, newLastname);
		pstmt.setInt(2, eid);

		cnt=pstmt.executeUpdate();
		System.out.println(String.format("Row affected : %d", cnt));

		// reuse the prepared statement
		newLastname = "Pandit";
		eid = 6;
		pstmt.setString(1, newLastname);
		pstmt.setInt(2, eid);

		cnt = pstmt.executeUpdate();
		System.out.println(String.format("Row affected %d", cnt));
		con.close();
	}
	
	public static void main(String[] args) {
		
		UpdateDemo c1 = new UpdateDemo();
		
		System.out.println(" ********** Update Candidate Details ********** ");
		
		try {
			
			c1.getConnection();
			c1.UpdateCandidate();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}


}
