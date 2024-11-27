package assignment2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		
		Connection con = null;
		String jdbcUrl = "jdbc:mysql://localhost:3306/vehicledb";
		String query = "select * from emp"; 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con = DriverManager.getConnection(jdbcUrl, "root", "shreya");
			System.out.println("DB connected");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+ " : ");
				System.out.print(rs.getString(2)+ " : ");
				System.out.print(rs.getString(3)+ " : ");
				System.out.print(rs.getFloat(4));
				System.out.println();
			}
			
		}  
		catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("Driver not registered");
		}
		catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("Database is not connected");
		}
		finally {
			try {
				if(con != null) {
					System.out.println("\n\nClosing Connection !!!");
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}
}
