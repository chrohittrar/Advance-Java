package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3 {

	public static void main(String[] args) {
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/vehicledb";
		String username = "root";
		String password = "shreya";
		Connection con = null;
		String query = "update emp set sal = 1000.0 where empno = 7654";
		
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			
			Statement stmt = con.createStatement();
			 
			int n = stmt.executeUpdate(query);
			
			System.out.println("Number of changed records : "+n);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
