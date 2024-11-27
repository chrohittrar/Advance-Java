package assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;

public class Assignment4 {

	public static void main(String[] args) {
		
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/vehicledb";
		String username = "root";
		String password = "shreya";
		String query = "select * from emp";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connected");
			stmt = con.createStatement();	
			rs = stmt.executeQuery(query);
			System.out.println("DB Connected");

			
			Set<Employee> emps = new TreeSet<>();
			while(rs.next()) {
			Employee e = new Employee(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getInt(4),
					rs.getDate(5),
					rs.getFloat(6),
					rs.getInt(7)
					);
			emps.add(e);
			}
			
			for (Employee e : emps) {
				System.out.println(e);
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		}

	}

}
