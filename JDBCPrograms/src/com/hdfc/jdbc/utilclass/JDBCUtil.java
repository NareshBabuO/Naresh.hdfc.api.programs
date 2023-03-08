package com.hdfc.jdbc.utilclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {

//	private static Connection connection = null;

	public static Connection getDBConnection() {

		Connection connection2 = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:/hdfc_db";
			String username = "root";
			String password = "Mysql@123";

			connection2 = DriverManager.getConnection(url, username, password);

			/*
			 * FileReader fileReader = new FileReader("database.properties");
			 * 
			 * Properties properties = new Properties();
			 * 
			 * properties.load(fileReader);
			 * 
			 * String driver = properties.getProperty("driver.class");
			 * 
			 * String url = properties.getProperty("url");
			 * 
			 * String username = properties.getProperty("username");
			 * 
			 * String password = properties.getProperty("password");
			 * 
			 * // Class.forName(driver); Class.forName(driver); connection =
			 * DriverManager.getConnection(url, username, password);
			 */
		} catch (

		ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		return connection2;
		// }
	}

}
