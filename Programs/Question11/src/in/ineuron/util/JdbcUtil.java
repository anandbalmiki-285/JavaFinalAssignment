package in.ineuron.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	private JdbcUtil() {
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "snehanand@285";
		Connection connnection = DriverManager.getConnection(url, user, password);
		return connnection;
	}

}
