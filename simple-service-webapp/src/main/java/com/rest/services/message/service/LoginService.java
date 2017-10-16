package com.rest.services.message.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.rest.services.message.model.UserDetails;

public class LoginService {

	public String authenticateUser(UserDetails userDetails) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "satish", "satish");
			PreparedStatement preparedStatement = con
					.prepareStatement("select * from login where username=? and password=?");
			preparedStatement.setString(1, userDetails.getUserName());
			preparedStatement.setString(2, userDetails.getPassword());
			preparedStatement.executeQuery();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Login Success";
	}
}
