package com.jayson.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jayson.Model.User;

public class UserDAO {
	
	public int registerStudent(User student)
			throws ClassNotFoundException{
		
		String INSERT_USERS_SQL = "INSERT INTO users" +
		                          " (firstname, lastname, username, password) VALUES" +
		                          " (?, ?, ?, ?)";
		
		int result = 0;
		
		try {
			
			Connection connection = DBUtils.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement(INSERT_USERS_SQL);
			prepareStatement.setString(1, student.getFirstname());
			prepareStatement.setString(2, student.getLastname());
			prepareStatement.setString(3, student.getUsername());
			prepareStatement.setString(4, student.getPassword());
			
			result = prepareStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
