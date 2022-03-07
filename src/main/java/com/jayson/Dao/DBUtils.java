package com.jayson.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	
	private static String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
	private static String jdbcusername = "root";
	private static String jdbcpassword = "Jayson556612";
	
	
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL,jdbcusername,jdbcpassword);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return connection;
	}

}
