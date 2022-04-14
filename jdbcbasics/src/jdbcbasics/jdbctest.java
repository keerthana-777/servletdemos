package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest {

	public static void main(String[] args) {
		System.out.println("JDBC Test");

		try (
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "keerthana");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from account");				
		) {

			// insert  (C)
			int result = statement.executeUpdate("insert into account values(5,'keerthana', 'bandari', 360)");
			System.out.println("Number of rows inserted: " + result);

			// update (U)
//			int result = statement.executeUpdate("update account set balance=13000 where accno=2");
//			System.out.println("Number of rows updated: " + result);

			// delete (D)
		//int result = statement.executeUpdate("delete from account where accno=5");
			//System.out.println("Number of rows deleted: " + result);
			
			// read (R)
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + ". " + rs.getString(2) + ", " + rs.getString(3) + ": Balance=" + rs.getInt(4));
//			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
}
