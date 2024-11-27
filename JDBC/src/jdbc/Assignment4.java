package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
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
			stmt = con.createStatement();	
			rs = stmt.executeQuery(query);
			
			Set<Employee> emps = new TreeSet<>();
			Employee e = new Employee(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.get(4),
					rs.getInt(5),
					rs.getInt(6),
					rs.getInt(7),
					rs.getInt(8),
					);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
