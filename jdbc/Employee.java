package jdbcdemo;
import java.sql.*;
/**
 * Author : sirin
 * Date : Jul 13, 2026
 * Time : 4:25:45 PM
 * Email : sirinandini.a@gmail.com
 */


//Employee class implement CRUD operations
public class Employee {


	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet res;



	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee_db",
					"root",
					"Siri789");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}



	public void getEmployee() throws SQLException 
	{
		System.out.println("**************** Display Employees*****************");
		con = getConnection();

		String sql = "SELECT * FROM Employee";
		st = con.createStatement();
		res = st.executeQuery(sql);

		while(res.next()) {
			System.out.println(
					res.getInt("eid") + "\t" +
							res.getString("name") + "\t" +
							res.getString("city") + "\t" +
							res.getString("contact"));
		}

		con.close();


	}




	public void insertEmployee(String name, String city, String contact) 
	{
		System.out.println("**************** Insert new Employees*****************");
		try {
			con = getConnection();

			String sql = "INSERT INTO Employee(name,city,contact) VALUES(?,?,?)";

			ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contact);

			int i = ps.executeUpdate();

			if(i > 0)
				System.out.println("Employee Inserted Successfully");

			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

	}



	public void getEmployeeByID(int id) {
		System.out.println("**************** Display Employee by ID*****************");
		try {
			con = getConnection();

			String sql = "SELECT * FROM Employee WHERE eid=?";

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			res = ps.executeQuery();

			if(res.next()) {

				System.out.println(
						res.getInt("eid") + "\t" +
								res.getString("name") + "\t" +
								res.getString("city") + "\t" +
								res.getString("contact"));
			}
			else {
				System.out.println("Employee Not Found");
			}

			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

	}




	public void updateEmployee(int id,String city) 
	{
		System.out.println("**************** Update Employees*****************");
		try {
			con = getConnection();

			String sql = "UPDATE Employee SET city=? WHERE eid=?";

			ps = con.prepareStatement(sql);

			ps.setString(1, city);
			ps.setInt(2, id);

			int i = ps.executeUpdate();

			if(i > 0)
				System.out.println("Employee Updated Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}





	public void deleteEmployee(int id) 
	{
		System.out.println("**************** Delete Employees*****************");
		try {
			con = getConnection();

			String sql = "DELETE FROM Employee WHERE eid=?";

			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			int i = ps.executeUpdate();

			if(i > 0)
				System.out.println("Employee Deleted Successfully");
			else
				System.out.println("Employee Not Found");

			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
