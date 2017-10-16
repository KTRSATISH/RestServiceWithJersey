package com.rest.services.message.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.rest.services.message.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello India!", "Neha");
		Message m2 = new Message(2L, "Hello To RTST!", "Neha");
		List<Message> messageList = new ArrayList<>();
		messageList.add(m1);
		messageList.add(m2);
		return messageList;
	}

	public Message addMessage(Message message) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "satish", "satish");
			PreparedStatement preparedStatement = con.prepareStatement("insert into message values(?,?,?,?)");
			preparedStatement.setLong(1, message.getId());
			preparedStatement.setString(2, message.getMessage());
			preparedStatement.setDate(3, Date.valueOf(LocalDate.now()));
			preparedStatement.setString(4, message.getAuthor());
			preparedStatement.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}
}
