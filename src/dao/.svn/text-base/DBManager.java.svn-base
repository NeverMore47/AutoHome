package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	
	private static final String USERNAME = "root";
	private static final String PWD = "nikecr7";
	private static final String URL = "jdbc:mysql://localhost:3306/autohome";
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PWD);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public void closeAll(ResultSet rs, PreparedStatement ps, Connection con) {

		try {

			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}

			if (con != null) {
				con.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
