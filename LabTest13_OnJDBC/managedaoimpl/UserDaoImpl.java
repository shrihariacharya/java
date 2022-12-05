package managedaoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import manageconnection.ConnectionProvider;
import managedao.UserDao;
import java.sql.SQLException;


public class UserDaoImpl implements UserDao {
	Connection con = ConnectionProvider.getConnection();
	
	public int insertUser(int uid, String uname, String upassword, String ucity) throws SQLException {
		String qry = "insert into user(uid,uname,upassword,ucity) values('" + uid + "'," + uname + "," + upassword
				+ " ," + ucity + ")";
		Statement st = con.createStatement();
		int i = st.executeUpdate(qry);
		return i;
		
	}
	
	
	public void displayUser(int uid) throws SQLException {
		String qry = "Select * from user where uid=" + uid;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qry);
		while (rs.next()) {
			System.out.println("uid :" + rs.getInt(1));
			System.out.println("uName :" + rs.getString(2));
			System.out.println("upassword :" + rs.getString(3));
			System.out.println("ucity :" + rs.getString(4));
			System.out.println("......................................................");
		}

	}

	
	public void displayAllUser() throws SQLException {
		String qry = "Select * from user";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qry);
		while (rs.next()) {
			System.out.println("uid :" + rs.getInt(1));
			System.out.println("uName :" + rs.getString(2));
			System.out.println("upassword :" + rs.getString(3));
			System.out.println("ucity :" + rs.getString(4));
			System.out.println("......................................................");
		}

	}

	
	public int updateUser(int uid, String uname) throws SQLException {
		String qry = "update user set uname='" + uname + "' where uid=" + uid;
		Statement st = con.createStatement();
		int i = st.executeUpdate(qry);
		return i;
	}

	
	public int deleteUser(int uid) throws SQLException {
		String qry = "delete from  user where uid=" + uid;
		Statement st = con.createStatement();
		int i = st.executeUpdate(qry);
		return i;
	}
}
