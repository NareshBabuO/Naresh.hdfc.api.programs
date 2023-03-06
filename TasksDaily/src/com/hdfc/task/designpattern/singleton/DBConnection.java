package com.hdfc.task.designpattern.singleton;

public class DBConnection {
	
	private static DBConnection conn;
	
	private DBConnection() {
		
	
	}
	
	
		public static DBConnection   getConnectionInstance() {
			
			
			if(conn == null) {
				
				conn = new DBConnection();
				
			}
			
			return conn;
			
		}
	

}
