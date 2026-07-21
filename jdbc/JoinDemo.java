package jdbcdemo;
import java.sql.*;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 12:47:27 PM
 * Email : sirinandini.a@gmail.com
 * JDBC Join Example to retrieve records from MySQL Database table using ConnectionUtil class,
 * by joining 3 tables candidates, candidate_skills and skills
 */

public class JoinDemo {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			con = ConnectionUtil.createConnection();
			stmt = con.createStatement();
			
			
			//Join Query
			rs = stmt.executeQuery(
					"SELECT c.id, first_name, name " +
							"FROM candidates c " +
							"INNER JOIN candidate_skills s ON c.id = s.candidate_id " +
							"INNER JOIN skills sk ON s.skill_id = sk.id"
					);
			
			System.out.println("Candidate ID | Fisrt Name | Skill Name");
			
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) );
			}

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

