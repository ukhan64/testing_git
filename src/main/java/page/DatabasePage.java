package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	public static String getdata(String columnName) throws ClassNotFoundException, SQLException {
		
		
// setting properties for mysql
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl= "jdbc:mysql://localhost:3306/april2021";
		String sqlUsername= "root";
		String sqlPassword= "root";
		String query= "Select * from users";
		
		// Create connection to local database
		Connection connection= 	DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
		
		// empowering the connection reference variable to execute queries
		
		Statement statement= connection.createStatement();
		
		//Delivering the sql query
		ResultSet rs=statement.executeQuery(query);
		
		while (rs.next()) { 
			return rs.getString(columnName);
		}
		
	return columnName;
}
}
