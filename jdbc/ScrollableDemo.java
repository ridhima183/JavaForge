package jdbcdemo;
import java.sql.*;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 12:33:43 PM
 * Email : sirinandini.a@gmail.com
 */

public class ScrollableDemo {
	public static void main(String[] args) {


		Connection con=null;
		Statement stmt;
		ResultSet rs;

		try {
			con = ConnectionUtil.createConnection();

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery("select * from candidates");
			System.out.println("********** Display Records from Top to Bottom ********* ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}

			System.out.println("********** Display Records from Bottom to Top ********* ");
			rs.afterLast(); // read from bottom to top
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}

			System.out.println("*****************Display 50th Record***********************");
			rs.absolute(50); // move the cursor to 50th record
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			System.out.println("**********************************************************");

			System.out.println("************Display 40th record using relative()***********");
			rs.relative(-10); // move the cursor to 40th record using relative
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			System.out.println("**********************************************************");

			System.out.println("************Display First record using first()***********");
			rs.first(); // move the cursor to first record
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			System.out.println("**********************************************************");

			rs.absolute(4);
			System.out.println("Current Cursor Position : "+rs.getRow());

			rs.last();
			System.out.println("Total no. of Records:"+rs.getRow());

			con.close();
		}
		catch(Exception e){ 

			System.out.println(e);
		}  
	}



}
