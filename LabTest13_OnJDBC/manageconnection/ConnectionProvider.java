package manageconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {


  public static Connection getConnection()
  {
	 try {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","Shri1234");

	} catch (SQLException e) {
		
		e.printStackTrace();
		return null;
	}


  }
}