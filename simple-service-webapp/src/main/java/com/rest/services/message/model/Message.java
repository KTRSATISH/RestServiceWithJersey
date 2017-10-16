package com.rest.services.message.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Message {

	private Long id;
	private String message;
	private Date createdDate;
	private String author;

	public Message() {
	}

	public Message(Long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.createdDate = new Date();
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
