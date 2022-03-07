package com.jayson.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jayson.Model.LoginModel;

public class LoginDAO {
	
	public boolean validate(LoginModel loginModel) {
		
		boolean status = false;
		String LOGIN_SQL = "SELECT * FROM users WHERE username = ? AND password = ?";
		
		try {
			Connection connection = DBUtils.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement(LOGIN_SQL);
			prepareStatement.setString(1, loginModel.getUsername());
			prepareStatement.setString(2, loginModel.getPassword());
			ResultSet rs =  prepareStatement.executeQuery();
			
			if(rs.next()) {
				status = true;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(status);
		return status;
	}

}
