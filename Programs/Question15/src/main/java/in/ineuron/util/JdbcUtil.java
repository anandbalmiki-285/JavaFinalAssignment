package in.ineuron.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

public class JdbcUtil {

	private JdbcUtil() {
	}
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "snehanand@285";
		Connection connnection = DriverManager.getConnection(url, user, password);
		return connnection;
	}

}
