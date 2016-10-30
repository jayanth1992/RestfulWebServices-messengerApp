package org.jayanth.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // This annotation tells JaxB to convert the model to an xml format
public class Message {
	
	private int id;
	private String message;
	private Date dateCreated;
	private String author;
	
	public Message() {
		
	}
	
	public Message(int id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
