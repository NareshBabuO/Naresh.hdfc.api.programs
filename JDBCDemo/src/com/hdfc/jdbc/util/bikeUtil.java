package com.hdfc.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bikeUtil {

	public static Connection getConnection() {

		Connection connection = null;

		try {

			
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  String url = "jdbc:mysql://localhost:/hdfc_db"; String username = "root";
			  String password = "Mysql@123";
			 
			 

			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/hdfc";
			String username = "postgres";
			String password = "admin";

			connection = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}

}
