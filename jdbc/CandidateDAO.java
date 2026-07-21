package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 2:51:36 PM
 * Email : sirinandini.a@gmail.com
 */

public class CandidateDAO {
	private final String INSERT_QUERY =
            "INSERT INTO candidates(first_name,last_name,dob,phone,email) VALUES(?,?,?,?,?)";
	public boolean insertCandidate(Candidate candidate) {
		try (Connection conn = ConnectionUtil.createConnection();
				PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY)){
			    pstmt.setString(1,candidate.getFirstName());
			    pstmt.setString(2,candidate.getLastName());
			    pstmt.setString(3,candidate.getDob());
			    pstmt.setString(4,candidate.getPhone());
			    pstmt.setString(5,candidate.getEmail());
			    
			    int rows=pstmt.executeUpdate();
			    
			    return rows>0;
			    
		}
		catch (Exception e) {
			e.printStackTrace();
			    
		}
		return false;
	}

}

