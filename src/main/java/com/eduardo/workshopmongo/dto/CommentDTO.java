package com.eduardo.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import com.eduardo.workshopmongo.domain.User;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	
	private User author;

	public CommentDTO(){}

	public CommentDTO(String text, Date date, User author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
	
}
