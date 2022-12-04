package managedao;

import java.sql.SQLException;

public interface UserDao {

	int insertUser(int uid, String uname, String upassword, String ucity) throws SQLException;

	
	void displayUser(int uid) throws SQLException;

	
	void displayAllUser() throws SQLException;

	
	int updateUser(int uid, String uname) throws SQLException;

	
	int deleteUser(int uid) throws SQLException;
}